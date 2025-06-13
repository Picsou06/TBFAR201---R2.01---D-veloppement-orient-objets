package POO;

import java.io.*;
import java.util.*;

public class ParserCodePostal {
    public static Map<String, String> parseFichier(String chemin, String separator) throws IOException {
        Map<String, String> dico = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                ligne = ligne.trim();
                int idx = ligne.lastIndexOf(separator);
                if (idx > 0) {
                    String nom = ligne.substring(0, idx).trim();
                    String code = ligne.substring(idx + 1).trim();
                    dico.put(code, nom);
                }
            }
        }
        return dico;
    }
}