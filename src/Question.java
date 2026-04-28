import java.util.ArrayList;

public class Question {

    private String titre;
    private ArrayList<Reponse> reponses;

    public Question(String titre, ArrayList<Reponse> reponses){
        this.titre = titre;
        this.reponses = reponses;
    }

    public String getTitre(){
        return this.titre;
    }

    public ArrayList<Reponse> getReponses(){
        return this.reponses;
    }


    
}
