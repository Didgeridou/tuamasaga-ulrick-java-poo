import java.util.ArrayList;

public class Quiz {

    private String nom;
    private Redacteur redacteur;
    private Categorie categorie;
    private ArrayList<Question> questions;

    public Quiz(String nom, Redacteur redacteur, Categorie categorie, ArrayList<Question> questions){
        this.nom = nom;
        this.redacteur = redacteur;
        this.questions = questions;
    }

    public Redacteur getRedacteur(){
        return this.redacteur;
    }

    public Question getQuestion(int index){
        return this.questions.get(index);
    }

}
