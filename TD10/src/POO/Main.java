package POO;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String chemin = null;
        String separator = " ";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-path")) {
                chemin = args[i + 1];
            } else if (args[i].equals("-separator")) {
                separator = args[i + 1];
            }
        }
        if (chemin == null) {
            throw new IllegalArgumentException("Le chemin du fichier n'est pas spécifié.\nUsage : java Main -path <chemin_du_fichier> [-separator <separateur>]");
        }
        Map<String, String> dico;
        try {
            dico = ParserCodePostal.parseFichier(chemin, separator);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(dico);
        writeKeyFile("France_Codes_2009.txt", dico);
        writeValueFile("France_Communes_2009.txt", dico);
    }

    public static void writeKeyFile(String filename, Map<String, String> dico) {
        String chemin = "src/POO/output/" + filename;
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(chemin))) {
            for (Map.Entry<String, String> entry : dico.entrySet()) {
                writer.write(entry.getKey());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeValueFile(String filename, Map<String, String> dico) {
        String chemin = "src/POO/output/" + filename;
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(chemin))) {
            for (Map.Entry<String, String> entry : dico.entrySet()) {
                writer.write(entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
