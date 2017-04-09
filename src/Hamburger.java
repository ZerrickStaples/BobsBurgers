/**
 * Created by WeCanCodeIT on 3/20/2017.
 */
public class Hamburger
{
    //fields
    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    //addition fields
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    //create constructor to
    public Hamburger(String name, String meat, double price, String breadRoll)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    //Create methods to add additions to burger and price
    public void addBurgerAddition1(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addBurgerAddition2(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addBurgerAddition3(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addBurgerAddition4(String name, double price)
    {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name + "hamburger " + "on a " + this.breadRoll + " roll. " + "The price is " +
        this.price + ".");

        if (this.addition1Name != null)
        {
            hamburgerPrice += this.addition1Price;
            System.out.println("added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null)
        {
            hamburgerPrice += this.addition2Price;
            System.out.println("added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null)
        {
            hamburgerPrice += this.addition3Price;
            System.out.println("added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null)
        {
            hamburgerPrice += this.addition4Price;
            System.out.println("added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        //return
        return hamburgerPrice;
    }
}
