package org.example.models;

public class Hamburger {
    private String name;
    private String  meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1( String name,double price){
        this.addition1Name = name;
        this.addition1Price =price;
    }
    public void addHamburgerAddition2( String name,double price){
        this.addition2Name = name;
        this.addition2Price =price;
    }
    public void addHamburgerAddition3( String name,double price){
        this.addition3Name = name;
        this.addition3Price =price;
    }
    public void addHamburgerAddition4( String name,double price){
        this.addition4Name = name;
        this.addition4Price =price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price+addition3Price+addition2Price+addition1Price+addition4Price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public double itemizeHamburger(){

        System.out.println(name);
        System.out.println(meat);
        System.out.println(breadRollType);

        if(addition1Name != null){
            System.out.println(addition1Name);
        }
        if(addition2Name != null){
            System.out.println(addition2Name);
        }
        if(addition3Name != null){
            System.out.println(addition3Name);
        }
        if(addition4Name != null){
            System.out.println(addition4Name);
        }
        double malzeme = addition1Price+addition2Price+addition3Price+addition4Price;

        System.out.println(price+malzeme);
        return price+malzeme;

    }
}