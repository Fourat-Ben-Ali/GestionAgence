import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListVoitures {

    private List<Voiture> voitures;
    public ListVoitures( List<Voiture>voitures)
    {
     this.voitures=voitures;
    }
    public ListVoitures() {
        this.voitures = new ArrayList<>();
    }

    public void AjouterVoiture(Voiture voiture)
    {
        this.voitures.add(voiture);
    }

    public void AfficherVoiture()
    {
       Iterator<Voiture> i=voitures.iterator();
    while (i.hasNext())
   {
    Voiture voiture = i.next();
    System.out.println(voiture);
   }
    }

    public void SupprimerVoiture(Voiture voiture) throws VoitureException
    {
        if(this.voitures.contains(voiture))
        {
            this.voitures.remove(voiture);
            System.out.println("voiture supprimé avec succées");
        }
        else
            throw new VoitureException("voiture n'existe pas");
    }

}
