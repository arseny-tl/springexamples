package com.tl.springexamples.vacancy_questions;

import com.tl.springexamples.vacancy_questions.model.SampleElementWithSameHashcode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class NullElementsToMapAndSetTest {

  @Test
  public void hashSet_shouldAddOnlyOneNullElement() {
    Set<Object> test = new HashSet<>();
    test.add(null);
    Assert.assertFalse(test.add(null));
  }

  @Test
  public void set_willContainBothItems_ifObjectsHaveSameHashcode_butNotEqual() {
    Set<Object> test = new HashSet<>();
    SampleElementWithSameHashcode firstElem = new SampleElementWithSameHashcode();
    SampleElementWithSameHashcode secondElem = new SampleElementWithSameHashcode();
    firstElem.setId(0L);
    secondElem.setId(1L);

    test.add(firstElem);
    test.add(secondElem);

    Assert.assertEquals("firstElem equals secondElem", 2, test.size());
  }

  @Test
  public void hashMap_canApplyNullElementAsKey() {
    Map<Object, Object> test = new HashMap<>();
    Object expected = new Object();
    test.put(null, expected);
    Assert.assertEquals("HashMap has no [null; new Object()] pair!", expected, test.get(null));
  }

  @Test
  public void hashMap_canApplyNullElementAsKey_andDoReturnSameObjectByNullKey() {
    Map<Object, Object> test = new HashMap<>();
    Object expected = new Object();
    test.put(null, expected);

    Object newObject = test.get(null);
    Assert.assertEquals(
      "Object that we got from map with null key is not the same", expected, newObject);
  }

  @Test
  public void hashMap_doReplaceObjectWithNullKey_ifAnotherObjectAddedWithNullKey() {
    Map<Object, Object> test = new HashMap<>();
    Object expected = new Object();
    Object expected2 = new Object();
    test.put(null, expected);
    test.put(null, expected2);

    Object actual = test.get(null);
    Assert.assertEquals("Map returned not the second one object", expected2, actual);
  }

  @Test
  public void hashMap_canApplyNullElementAsValue_whenNullIsKey() {
    HashMap<Object, Object> test = new HashMap<>();
    test.put(null, null);
    Assert.assertEquals("Null wasn't lastly added", 1, test.size());
  }
}
