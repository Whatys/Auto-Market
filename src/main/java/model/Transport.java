package model;
public class Transport {
    public Integer anulProducerii;
    public Double pret;
    public Integer kilometraj;
    public String marka;
    public String model;
    public String cutiaDeViteza;
    public TipCombustibil combustibil;

    public Transport(){
    }
    public Transport(Integer anulProducerii, Double pret, Integer kilometraj, String marka, String model, String cutiaDeViteza, TipCombustibil combustibil) {
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

    public void setAnulProducerii(Integer anulProducerii) {
        this.anulProducerii = anulProducerii;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
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
}