package model;

import javax.persistence.*;

@Entity
@Table(name = "TRANSPORT")
public class Transport {
    @Id @GeneratedValue
    @OneToMany 
    @Column(name = "IdTransport")
    public Integer Id;
    @Column(name = "anulProducerii")
    public Integer anulProducerii;
    @Column(name = "pret")
    public Double pret;
    @Column(name = "kilometraj")
    public Integer kilometraj;
    @Column(name = "marka")
    public String marka;
    @Column(name = "model")
    public String model;
    @Column(name = "cutiaViteza")
    public String cutiaDeViteza;
    @Column(name = "combustibil")
    public TipCombustibil combustibil;

    public Transport() {
    }

    public Transport(Integer Id , Integer anulProducerii, Double pret, Integer kilometraj, String marka, String model, String cutiaDeViteza, TipCombustibil combustibil) {
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