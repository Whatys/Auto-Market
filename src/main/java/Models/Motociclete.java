package Models;
public class Motociclete extends Transport{
    public Motociclete() {
        anulProducerii = 2023;
        pret = 0;
        kilometraj = 0;
        marka = "Java";
        model= "359";
        cutiaDeViteza = "Manual";
        combustibil = TipCombustibil.Benzina;
    }

    public Motociclete(int anulProducerii, double pret, int kilometraj, String marka, String model, String cutiaDeViteza, TipCombustibil combustibil) {
        this.anulProducerii = anulProducerii;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.marka = marka;
        this.model = model;
        this.cutiaDeViteza = cutiaDeViteza;
        this.combustibil = combustibil;
    }

    public int getAnulProducerii() {
        return anulProducerii;
    }

    public void setAnulProducerii(int anulProducerii) {
        this.anulProducerii = anulProducerii;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public void setKilometraj(int kilometraj) {
        this.kilometraj = kilometraj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCutiaDeViteza() {
        return cutiaDeViteza;
    }

    public void setCutiaDeViteza(String cutiaDeViteza) {
        this.cutiaDeViteza = cutiaDeViteza;
    }

    public TipCombustibil getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(TipCombustibil combustibil) {
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Motociclete " +
                "anulProducerii=" + anulProducerii +
                ", pret=" + pret +
                ", kilometraj=" + kilometraj +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cutiaDeViteza='" + cutiaDeViteza + '\'' +
                ", combustibil=" + combustibil;
    }
}
