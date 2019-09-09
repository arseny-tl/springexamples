package com.tl.springexamples.vacancy_questions.staticinit;

public class Parent {

  static {
    System.out.println("Parent static");
  }

  private int someInt;

  {
    System.out.println("Parent static without 'static' modifier");
  }

  public Parent() {
    System.out.println("Parent constructor");
  }

  public int getSomeInt() {
    return someInt;
  }

  public void setSomeInt(int someInt) {
    this.someInt = someInt;
  }

  public static class InnerChild extends Parent {

    static {
      System.out.println("InnerChild static");
    }

    {
      System.out.println("InnerChild static without 'static' modifier");
    }

    public InnerChild() {
      super();
      System.out.println("InnerChild constructor");
    }

    @Override
    public int getSomeInt() {
      return super.getSomeInt();
    }
  }
}
