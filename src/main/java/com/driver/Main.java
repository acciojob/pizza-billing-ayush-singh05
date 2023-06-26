package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addTakeaway();
    dp.addExtraToppings();
    dp.addExtraToppings();
    dp.addExtraCheese();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    System.out.println(p.getPrice());
    p.addExtraToppings();
    p.addExtraCheese();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}