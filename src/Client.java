import java.util.Objects;

public class Client {
    private String code;
    private String nom;
    private String prenom;

    public Client()
    {
        this.code="";
        this.nom="";
        this.prenom="";
    }
    public Client(String code,String nom , String prenom)
    {
        this.code=code;
        this.nom=nom;
        this.prenom=prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(code, client.code);
    }

}
