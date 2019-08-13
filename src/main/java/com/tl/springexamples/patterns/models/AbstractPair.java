package com.tl.springexamples.patterns.models;

import java.util.Objects;

public abstract class AbstractPair implements Cloneable {

  private Object left;
  private Object right;

  public AbstractPair() {
  }

  public AbstractPair(AbstractPair abstractPair) {
    if (abstractPair != null) {
      this.left = abstractPair.left;
      this.right = abstractPair.right;
    }
  }

  public abstract AbstractPair clone();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractPair)) {
      return false;
    }
    AbstractPair abstractPair = (AbstractPair) o;
    return Objects.equals(left, abstractPair.left) && Objects.equals(right, abstractPair.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }
}
