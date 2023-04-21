package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Demander le nom
        System.out.print("Entrez le nom du fichier texte : ");
        String nomF = scanner.nextLine();
        // Ouvrir le fichier
        try (BufferedReader rd = new BufferedReader(new FileReader(nomF))) {
            // Lire le fichier
            int numL = 1; String Ligne;

            while ((Ligne = rd.readLine()) != null) {
                // Afficher le numéro de ligne avec 4 caractères
                System.out.printf("%4d ",numL);
                // Si la ligne contient plus de 40 caractères
                if (Ligne.length() > 40) {
                    int debut = 0;
                    int fin;
                    while (debut < Ligne.length()) {
                        fin = debut + 40;
                        if (fin > Ligne.length()) {
                            fin = Ligne.length();
                        }
                        System.out.println(Ligne.substring(debut, fin));
                        debut = fin;
                    }
                } else {
                    // Sinon, afficher la ligne entière
                    System.out.println(Ligne);
                }
                numL++;
            }
            System.out.println("//** Fin Fichier **//");

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            System.exit(2);
        }

    }
}