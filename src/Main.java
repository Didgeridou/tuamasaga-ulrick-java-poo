import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Redacteur redacteur = new Redacteur("TUAMASAGA", "Ulrick");
        
        // Initialisation joueurs
        Joueur joueur1 = new Joueur("Joueur","1");
        Joueur joueur2 = new Joueur("Joueur","2");

        // Initialisation catégorie
        Categorie maths = new Categorie("Mathématiques");

        // Initialisations réponses pour la question 1
        ArrayList<Reponse> reponses_q1 = new ArrayList<Reponse>();
        Reponse reponse_q1_1 = new Reponse("1", false);
        Reponse reponse_q1_2 = new Reponse("2", true);
        Reponse reponse_q1_3 = new Reponse("3", false);
        Reponse reponse_q1_4 = new Reponse("4", false);
        reponses_q1.add(reponse_q1_1);
        reponses_q1.add(reponse_q1_2);
        reponses_q1.add(reponse_q1_3);
        reponses_q1.add(reponse_q1_4);

        // Initialisation des questions
        ArrayList<Question> questions = new ArrayList<Question>();
        Question q1 = new Question("1 + 1 ?", reponses_q1);
        Question q2 = new Question("2 + 2 ?", reponses_q1);
        Question q3 = new Question("3 + 3 ?", reponses_q1);
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        // Initialisation quiz
        Quiz quiz = new Quiz("Quiz numéro un", redacteur, maths, questions);

        // Nouvelle partie pour les joueurs
        Partie partie1 = new Partie(quiz, joueur1);
        Partie partie2 = new Partie(quiz, joueur2);

        

    }
}
