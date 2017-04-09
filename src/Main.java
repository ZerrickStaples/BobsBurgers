/**
 * Created by WeCanCodeIT on 3/20/2017.
 */
public class Main
{
    public static void main (String [] args)
    {
        Hamburger hamburger = new Hamburger("Basic ", "beef", 1.43, "white");
        double price = hamburger.itemizeHamburger();

        hamburger.addBurgerAddition1("tomato", .57);
        hamburger.addBurgerAddition2("lettuce", .28);
        hamburger.addBurgerAddition3("cheese", .61);
        hamburger.addBurgerAddition4("bacon", .84);

        System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("turkey", 2.68);
        price = healthyBurger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger("angus", 3.45);
        price = deluxeBurger.itemizeHamburger();



    }
}
