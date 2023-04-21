package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom de fichier : ");
        String filename = sc.nextLine();
        FileWriter fw = null;
        fw = new FileWriter(filename);

        // Saisie les informations de chaque personne
        while (true) {
            System.out.print("Nom : ");
            String nom = sc.nextLine();
            if (nom.isEmpty()) {
                break;
            }fw.write(nom +"-");
            System.out.print("Prenom : ");
            String prenom = sc.nextLine();
            fw.write(prenom +"-");

            System.out.print("Date de naissance : ");
            String dateNaissance = sc.nextLine();
            fw.write(dateNaissance +"-");
            fw.flush();
        }
        fw.close();
    }}
