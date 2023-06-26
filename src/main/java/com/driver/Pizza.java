package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isAddedChese;
    private boolean isAddedToppings;
    private boolean isTakeaway;
    private int chesePrice;
    private int toppingsprice;
    private int bag;
    private int baseprice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.baseprice = 300;
        }else {
            this.baseprice = 400;
        }
        this.price = baseprice;
       this.isTakeaway = false;
       this.isAddedChese = false;
       this.isAddedToppings = false;
       this.chesePrice = 80;
       this.toppingsprice = isVeg == true ? 70 : 120;
       this.bag = 20;
       this.bill = bill;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(!isAddedChese){
           this.price += chesePrice;
           this.isAddedChese = true;
       }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isAddedToppings){
            this.price += toppingsprice;
            this.isAddedToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price += 20;
            this.isTakeaway = true;
        }

    }

    public String getBill(){
        // your code goes here
        bill = "";
        bill += "Base Price Of The Pizza: "+baseprice+"\n";
        if(isAddedChese){
            bill += "Extra Cheese Added: "+ chesePrice+"\n";
        }
        if(isAddedToppings){
            bill += "Extra Toppings Added: "+toppingsprice+"\n";
        }
        if(isTakeaway){
            bill += "Paperbag Added: "+ bag + "\n";
        }
        bill += "Total Price: "+ price;
        return this.bill;
    }
}
