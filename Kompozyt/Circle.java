public class Circle extends Dot
{
    int radious;

    public Circle(int x, int y, int radious)
    {
        super();
        this.x = x;
        this.y = y;
        this.radious = radious;
    }

    @Override
    public void draw() {
        System.out.println("Okrąg");
    }
}
