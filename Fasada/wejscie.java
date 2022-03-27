public class wejscie implements budynek
{
    @Override
    public void open()
    {
        System.out.println("Witamy w klubie!");
    }

    @Override
    public void close()
    {
        System.out.println("Pokaż dowód osobisty\nŚwietnie!");
    }

    @Override
    public void unlock()
    {
        System.out.println("Klub został otwarty");
    }

    @Override
    public void lock()
    {
        System.out.println("Klub został zamknięty");
    }
}
