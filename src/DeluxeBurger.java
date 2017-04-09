/**
 * Created by WeCanCodeIT on 4/9/2017.
 */
public class DeluxeBurger extends Hamburger
{
    private String deluxeExtra1Name;
    private double deluxeExtra1Price;

    private String deluxeExtra2Name;
    private double deluxeExtra2Price;

    public DeluxeBurger(String meat, double price)
    {
        super("Deluxe ", meat, price, "glazed donut");
    }
}
