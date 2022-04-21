package com.ynz.demo.stacktracer;

public class DemoStackTracer {

  public static void main(String... args) {
    var planAContext = new ImplementationContext(new PlanA());
    var planBContext = new ImplementationContext(new PlanB());

    planBContext.carryout();
    planAContext.carryout();
  }
}
