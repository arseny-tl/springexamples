package com.tl.springexamples.patterns.models;

public class Pair<K, V> extends AbstractPair {

  private K left;
  private V right;

  public Pair() {
  }

  public Pair(Pair pair) {
    super(pair);
  }

  @Override
  public AbstractPair clone() {
    return new Pair<K, V>(this);
  }
}
