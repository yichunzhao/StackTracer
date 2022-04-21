package com.ynz.demo.stacktracer;

public class ImplementationContext {
  private final Strategy strategy;

  public ImplementationContext(Strategy strategy) {
    this.strategy = strategy;
  }

  public void carryout() {
    strategy.execute();
  }
}
