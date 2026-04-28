public class Reponse {

    private String texte;
    private boolean bonneReponse;
    private enum position{
        A,B,C,D
    }

    public Reponse(String texte, boolean bonneReponse){
        this.texte = texte;
        this.bonneReponse = bonneReponse;
    }

    public String getTexte(){
        return this.texte;
    }
    
}
