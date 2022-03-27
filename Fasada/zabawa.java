public class zabawa implements muzyka
{
    @Override
    public void on()
    {
        System.out.println("Bawmy się!");
    }

    @Override
    public void off()
    {
        System.out.println("Ale nudno :(");
    }
}
