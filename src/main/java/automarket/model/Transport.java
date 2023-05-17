package automarket.model;

import javax.persistence.*;

@Entity
@Table(name = "transport")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "anulProducerii")
    private Integer anulProducerii;

    @Column(name = "pret")
    private Double pret;

    @Column(name = "kilometraj")
    private Integer kilometraj;

    @Column(name = "marka")
    private String marka;

    @Column(name = "automarket.model")
    private String model;

    @Column(name = "cutiaViteza")
    private String cutiaDeViteza;

    public Transport() {
    }

    public Transport(Integer Id , Integer anulProducerii, Double pret, Integer kilometraj, String marka, String model, String cutiaDeViteza) {
        this.Id = Id;
        this.anulProducerii = anulProducerii;
        this.pret = pret;
        this.kilometraj = kilometraj;
        this.marka = marka;
        this.model = model;
        this.cutiaDeViteza = cutiaDeViteza;
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


}