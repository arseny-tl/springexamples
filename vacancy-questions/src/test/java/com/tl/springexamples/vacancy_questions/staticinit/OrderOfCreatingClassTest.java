package com.tl.springexamples.vacancy_questions.staticinit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class OrderOfCreatingClassTest {

  @Test
  public void create() {
    Parent parent = new Parent();
    parent.setSomeInt(7);
    parent = new Child();
    parent.setSomeInt(7);
    parent = new Child.InnerChild();
    Assert.assertEquals(0, parent.getSomeInt());
  }

}
