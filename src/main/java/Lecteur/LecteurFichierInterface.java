package Lecteur;

public interface LecteurFichierInterface {
    void afficherContenu();

    void afficherContenuALEnvers();

    void afficherContenuPalindrome();

    boolean comparer(LecteurFichierInterface autreFichier);
}
