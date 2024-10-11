package Lecteur;

import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException {
//        LecteurTxt lTxt = new LecteurTxt("src/main/java/Lecteur/Fichiers/text.txt");
//        System.out.println("Contenu : ");
//        lTxt.afficherContenu();
//
//        System.out.println("-------------------");
//
//        System.out.println("Contenu à l'envers : ");
//        lTxt.afficherContenuALEnvers();
//
//        System.out.println("-------------------");
//
//        System.out.println("Contenu Palindromique : ");
//        lTxt.afficherContenuPalindrome();
//
//        System.out.println("-------------------");
//
//        System.out.println("Pareil ? : ");
//        if (lTxt.comparer(new LecteurTxt("src/main/java/Lecteur/Fichiers/text2.txt"))) {
//            System.out.println("Oui");
//        } else {
//            System.out.println("Non");
//        }


        LecteurCsv lCsv = new LecteurCsv("src/main/java/Lecteur/Fichiers/eCsv.csv");
        System.out.println("Contenu : ");
        lCsv.afficherContenu();

        System.out.println("-------------------");

        System.out.println("Contenu à l'envers : ");
        lCsv.afficherContenuALEnvers();

        System.out.println("-------------------");

        System.out.println("Contenu Palindromique : ");
        lCsv.afficherContenuPalindrome();

        System.out.println("-------------------");

        System.out.println("Pareil ? : ");
        if (lCsv.comparer(new LecteurCsv("src/main/java/Lecteur/Fichiers/eCsv2.csv"))) {
            System.out.println("Oui");
        }
        else {
            System.out.println("Non");
        }

//        LecteurJson lJson = new LecteurJson("src/main/java/Lecteur/Fichiers/file.json");
//        System.out.println("Contenu : ");
//        lJson.afficherContenu();
//
//        System.out.println("-------------------");
//
//        System.out.println("Contenu à l'envers : ");
//        lJson.afficherContenuALEnvers();
//
//        System.out.println("-------------------");
//
//        System.out.println("Contenu Palindromique : ");
//        lJson.afficherContenuPalindrome();
//
//        System.out.println("-------------------");
//
//        System.out.println("Pareil ? : ");
//        if (lJson.comparer(new LecteurJson("src/main/java/Lecteur/Fichiers/file2.json"))) {
//            System.out.println("Oui");
//        }
//        else {
//            System.out.println("Non");
//        }
    }
}
