package com.tl.springexamples.vacancy_questions.functional;

import com.tl.springexamples.vacancy_questions.model.Product;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Slf4j
public class PredicateTest {

  private static final Product zeroIdDateNow = new Product(0L, LocalDate.now());
  private static final Product firstIdDateYesterday = new Product(1L, LocalDate.now().minusDays(1));
  private final List<Product> products = new ArrayList<>();

  @Before
  public void setUp() {
    products.add(zeroIdDateNow);
    products.add(firstIdDateYesterday);
  }

  @Test
  public void shouldReturnProductList_whereCreatedAtFilteredByPredicate() {
    Predicate<Product> onlyYesterday = x -> x.getCreatedAt().isEqual(LocalDate.now().minusDays(1));
    Predicate<Product> afterCurrentYear =
      x -> x.getCreatedAt().getYear() == LocalDate.now().getYear();
    List<Product> expectedYesterdayAndAfterCurrentYear = new ArrayList<>();
    expectedYesterdayAndAfterCurrentYear.add(firstIdDateYesterday);

    List<Product> actual =
      products.stream()
        .filter(onlyYesterday.and(afterCurrentYear))
        .peek(p -> log.info(p.toString()))
        .collect(Collectors.toList());

    Assert.assertEquals(expectedYesterdayAndAfterCurrentYear, actual);
  }
}
