public class main
{
    public static void main(String[] args)
    {
        Pizza pizza = new rodzaje();
        System.out.println(pizza.opis() + ": " + pizza.cena());

        pizza = new ananas(pizza);
        System.out.println(pizza.opis() +  ": " + pizza.cena());

        pizza = new kukurydza(pizza);
        System.out.println(pizza.opis() +": " + pizza.cena());
    }
}
