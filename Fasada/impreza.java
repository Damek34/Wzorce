public class impreza
{
    private budynek Wejscie = new wejscie();
    private muzyka Muzyka = new zabawa();

    void zamkniety_klub()
    {
        System.out.println("Zamkniety Klub");
        Wejscie.lock();
        Muzyka.off();
    }

    void otwarty_klub()
    {
        System.out.println("\nOtwarty klub");
        Wejscie.unlock();
        Wejscie.open();
        Muzyka.on();
    }

    void strzezony_klub()
    {
        System.out.println("\nStrzeżony klub");
        Wejscie.close();
        Muzyka.on();
    }

}
