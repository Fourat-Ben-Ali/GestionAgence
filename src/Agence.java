import java.util.HashMap;
import java.util.Map;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence()
    {
        this.nom="";
        this.vs=new ListVoitures();
        this.ClientVoitureLoue=new HashMap<Client, ListVoitures>();
    }
    public void ajoutVoiture(Voiture v)
            throws VoitureException{

    }

}
