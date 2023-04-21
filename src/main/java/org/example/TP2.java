package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String ligne = null;
        Scanner sc = new Scanner(System.in);
        // Demande à l'utilisateur de saisir un nom d'utilisateur
        System.out.print("Nom d'utilisateur : ");
        String login = sc.nextLine();
        System.out.print("Mot de passe : ");
        String password = sc.nextLine();
        System.out.print("Confirmez le mot de passe : ");
        String samepassword = sc.nextLine();
        // Parcourir le fichier input.txt
        while ((ligne = br.readLine()) != null){
            // Séparation des éléments de la ligne en une liste
            String[] elements = ligne.split("/");
            // Vérifier si l'utilisateur existe & mots de passe
            if (elements[0].equals(login) && elements[1].equals(password) && elements[2].equals(samepassword)) {
                System.out.println("Authentification réussie !");

            }
        }
        System.out.println("Erreur d'authentification : nom d'utilisateur ou mot de passe incorrect.");

    }
}
