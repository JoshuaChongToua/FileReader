package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public abstract class LecteurFichierAbstrait implements LecteurFichierInterface{
    protected String cheminFichier;
    protected ArrayList<String> lignes;

    public LecteurFichierAbstrait(String cheminFichier) {
        this.cheminFichier = cheminFichier;
        this.lignes = new ArrayList<>();
        lireFichier();
    }

    public void lireFichier() {
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                lignes.add(ligne);
            }

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
    }

    @Override
    public void afficherContenu() {
        for (String ligne : lignes) {
            System.out.println(ligne);
        }
    }

    @Override
    public void afficherContenuALEnvers() {
        for (int i = lignes.size()-1; i >= 0; i--) {
            System.out.println(lignes.get(i));
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
            System.out.println(reverse);
            reverse = "";
        }

    }

    @Override
    public boolean comparer(LecteurFichierInterface autreFichier) {
        return lignes.equals(((LecteurFichierAbstrait) autreFichier).lignes);
    }


    public String getCheminFichier() {
        return cheminFichier;
    }

    public void setCheminFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    public ArrayList<String> getLignes() {
        return lignes;
    }

    public void setLignes(ArrayList<String> lignes) {
        this.lignes = lignes;
    }
}