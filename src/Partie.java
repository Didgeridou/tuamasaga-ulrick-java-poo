import java.util.ArrayList;

public class Partie {
    private Quiz quiz;
    private Joueur joueur;
    private int score;

    public Partie(Quiz quiz, Joueur joueur){
        this.quiz = quiz;
        this.joueur = joueur;
        this.score = 0;

        System.out.println("Début partie");
        this.jouer();
    }

    public void jouer(){
        afficherQuestion(this.quiz);
    }

    public void afficherQuestion(Quiz quiz){
        System.out.println(quiz.getQuestion(0).getTitre());
        for(int i = 0; i < quiz.getQuestion(0).getReponses().size() - 1; i++){
            System.out.println(quiz.getQuestion(0).getReponses().get(i).getTexte());
        }
    }

    
}
