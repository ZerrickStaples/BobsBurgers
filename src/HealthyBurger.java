/**
 * Created by WeCanCodeIT on 3/20/2017.
 */
public class HealthyBurger extends Hamburger
{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price)
    {
        //super is used to call the parent constructor
        /*public Hamburger(String name, String meat, double price, String breadRoll)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }*/

        super("Healthy ", meat, price, "brown rye");
    }
}
