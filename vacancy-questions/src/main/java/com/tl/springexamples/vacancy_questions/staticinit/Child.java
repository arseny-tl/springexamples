package com.tl.springexamples.vacancy_questions.staticinit;

public class Child extends Parent {

  static {
    System.out.println("Child static");
  }

  {
    System.out.println("Child static without 'static' modifier");
  }

  public Child() {
    super();
    System.out.println("Child constructor");
  }

  @Override
  public int getSomeInt() {
    return super.getSomeInt();
  }
}
