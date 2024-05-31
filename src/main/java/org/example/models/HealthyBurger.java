package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + healthyExtra2Price+ healthyExtra1Price ;
    }

    @Override
    public double itemizeHamburger() {

        System.out.println(getName());
        System.out.println(getMeat());
        System.out.println(getBreadRollType());

        if(getAddition1Name() != null){
            System.out.println(getAddition1Name());
        }
        if(getAddition2Name() != null){
            System.out.println(getAddition2Name());
        }
        if(getAddition3Name() != null){
            System.out.println(getAddition3Name());
        }
        if(getAddition4Name() != null){
            System.out.println(getAddition4Name());
        }

        double hamburgerPrice = super.getPrice();


        if(healthyExtra1Name != null){
            System.out.println(healthyExtra1Name);
        }
        if(healthyExtra2Name != null){
            System.out.println(healthyExtra2Name);
        }

        System.out.println(hamburgerPrice+healthyExtra1Price+healthyExtra2Price);

        return hamburgerPrice+healthyExtra1Price+healthyExtra2Price;

    }
}