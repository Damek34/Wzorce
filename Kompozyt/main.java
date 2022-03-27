public class main
{
    public static void main(String[] args)
    {
        CompoundGraphic all = new CompoundGraphic();
        all.add(new Dot(10 , 5));
        all.add(new Circle(5, 3, 10));

        CompoundGraphic karton = new CompoundGraphic();
        karton.add(new Dot(34, 43));
        karton.add(new Circle(2,3, 5));
        all.add(karton);
        all.draw();

    }
}
