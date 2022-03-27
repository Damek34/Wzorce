public class kukurydza extends PizzaDekorator
{
    Pizza pizza;

    public kukurydza(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public float cena()
    {
        return pizza.cena() + 4F;
    }

    @Override
    public String opis()
    {
        return pizza.opis() + " z kukurydzą";
    }
}
