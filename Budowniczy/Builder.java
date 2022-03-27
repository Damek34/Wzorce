public abstract class Builder
{
    protected Czlowiek czlowiek;

    public void nowyCzlowiek()
    {
        czlowiek = new Czlowiek();
    }

    public Czlowiek getCzlowiek()
    {
        return czlowiek;
    }
    public abstract void buildImie();
    public abstract void buildNazwisko();
    public abstract void buildWiek();
    public abstract void buildRozmiarButa();
    public abstract void buildPesel();
    public abstract void buildMiejscowosc();
    public abstract void buildUlica();
    public abstract void buildNr_Domu();

}
