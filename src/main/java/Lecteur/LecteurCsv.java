package Lecteur;

public class LecteurCsv extends LecteurFichierAbstrait {
    public LecteurCsv(String cheminFichier) {
        super(cheminFichier);
    }

    @Override
    public void afficherContenu() {
        boolean isFirstLine = true;
        for (String ligne : lignes) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
            String ligneSansVirgules = ligne.replace(",", " ");
            System.out.println(ligneSansVirgules);
        }
    }

    @Override
    public void afficherContenuALEnvers() {
        for (int i = lignes.size()-1; i > 0; i--) {
            System.out.println(lignes.get(i).replace(",", " "));
        }
    }

    @Override
    public void afficherContenuPalindrome() {
        boolean isFirstLine = true;
        String reverse = "";
        char ch;
        for (String ligne : lignes) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
            for (int i=0; i<ligne.length(); i++)
            {
                ch= ligne.charAt(i);
                reverse = ch+reverse;
            }

            System.out.println(reverse.replace(",", " "));
            reverse = "";

        }

    }
}
