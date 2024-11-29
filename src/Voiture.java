import java.util.Objects;

public class Voiture  {

    private String immatriculation;
    private String marque;
    private float prix;


    public Voiture()
    {
        this.immatriculation="";
        this.marque="";
        this.prix=0;
    }
    public Voiture(String immatriculation, String marque, float prix)
    {
        this.immatriculation=immatriculation;
        this.marque=marque;
        this.prix=prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return  Objects.equals(immatriculation, voiture.immatriculation) && Objects.equals(marque, voiture.marque);
    }

}
