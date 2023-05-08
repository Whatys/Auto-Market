package model;
public class Camioane extends Transport{
    public Camioane() {
    }

    public Camioane(Integer Id,Integer anulProducerii, Double pret, Integer kilometraj, String marka, String model, String cutiaDeViteza, TipCombustibil combustibil) {
        this.Id = Id;
        this.anulProducerii = anulProducerii;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.marka = marka;
        this.model = model;
        this.cutiaDeViteza = cutiaDeViteza;
        this.combustibil = combustibil;
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public void setKilometraj(Integer kilometraj) {
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
        return "Camioane " +
                "Id=" + Id +
                ", anulProducerii=" + anulProducerii +
                ", pret=" + pret +
                ", kilometraj=" + kilometraj +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cutiaDeViteza='" + cutiaDeViteza + '\'' +
                ", combustibil=" + combustibil;
    }
}
