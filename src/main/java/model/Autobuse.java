package model;
public class Autobuse extends Transport{
    public Autobuse() {
    }

    public Autobuse(int anulProducerii, double pret, int kilometraj, String marka, String model, String cutiaDeViteza, TipCombustibil combustibil) {
        this.anulProducerii = anulProducerii;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.marka = marka;
        this.model = model;
        this.cutiaDeViteza = cutiaDeViteza;
        this.combustibil = combustibil;
    }

    public Integer getAnulProducerii() {
        return anulProducerii;
    }

    public void setAnulProducerii(int anulProducerii) {
        this.anulProducerii = anulProducerii;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Integer getKilometraj() {
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
        return "Autobuse " +
                "anulProducerii=" + anulProducerii +
                ", pret=" + pret +
                ", kilometraj=" + kilometraj +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cutiaDeViteza='" + cutiaDeViteza + '\'' +
                ", combustibil=" + combustibil;
    }
}
