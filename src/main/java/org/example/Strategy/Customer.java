package org.example.Strategy;

public class Customer {

    private Shop shop;

    public Customer(){}

    public Customer(Shop shop){
        this.shop = shop;
    }

    public void setShop(Shop shop){
        this.shop = shop;
    }

    public Shop getShop(){
        return this.shop;
    }

    public void buyGroceries(){
        System.out.println(shop.buyGroceries());
    }
}
