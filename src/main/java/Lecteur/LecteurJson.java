package Lecteur;

public class LecteurJson extends LecteurFichierAbstrait{

    public LecteurJson(String cheminFichier) {
        super(cheminFichier);
    }

    public void afficherContenu() {
        for (String ligne : lignes) {
            System.out.println(ligne.replaceAll("[{}]", ""));
        }
    }

    @Override
    public void afficherContenuALEnvers() {
        for (int i = lignes.size()-1; i >= 0; i--) {
            System.out.println(lignes.get(i).replaceAll("[{}]", ""));
        }
    }

    @Override
    public void afficherContenuPalindrome() {
        String reverse = "";
        char ch;
        for (String ligne : lignes) {
            for (int i=0; i<ligne.length(); i++)
            {
                ch= ligne.charAt(i);
                reverse = ch+reverse;
            }
            System.out.println(reverse.replaceAll("[{}]", ""));
            reverse = "";
        }

    }
}
