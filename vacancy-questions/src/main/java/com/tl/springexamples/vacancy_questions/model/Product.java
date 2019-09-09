package com.tl.springexamples.vacancy_questions.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

  private Long id;
  private LocalDate createdAt;

  public Product(Long id, LocalDate createdAt) {
    this.id = id;
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Product)) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(getId(), product.getId());
  }

  @Override
  public int hashCode() {
    int hash = 39;
    hash += id == null ? 0 : Objects.hashCode(id);
    return hash;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", createdAt=" + createdAt +
      '}';
  }
}
