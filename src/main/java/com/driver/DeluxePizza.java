package com.driver;

public class DeluxePizza extends Pizza {



    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
           this.addExtraCheese();
           this.getPrice();
           this.addExtraToppings();
        }
    }

}
