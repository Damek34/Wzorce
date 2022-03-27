public class ananas extends PizzaDekorator
{
    Pizza pizza;

    public ananas(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public float cena()
    {
        return pizza.cena() + 5F;
    }

    @Override
    public String opis()
    {
        return pizza.opis() + " z ananasem";
    }
}
