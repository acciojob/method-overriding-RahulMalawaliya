package com.driver;

public class Main {
  
  public static void main(String[] args) {
        B ob=new B();
        ob.meth();
    }

    public static class A
    {
        public void meth()
        {
            System.out.println("Invoking method from class A");
        }
    }
    public static class B extends A
    {
        @Override
        public void meth()
        {
            System.out.println("Method is overridden in Extendend class B");
        }
    }
  
}
