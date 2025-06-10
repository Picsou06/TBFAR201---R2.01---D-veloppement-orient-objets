package Ex01;

import java.util.Map;

public class Parking {
    private Map<Integer, Vehicule> vehicules;
    private final int capacite;

    public Parking(int capacite) {
        this.capacite = capacite + 1;
        this.vehicules = new java.util.HashMap<>(capacite);
    }

    public boolean isfree(int place) {
        return !vehicules.containsKey(place);
    }

    public void garer(Vehicule vehicule, int place) {
        if (place <= 0 || place > capacite) {
            throw new IndexOutOfBoundsException("Erreur : la place de parking est invalide.");
        }
        if (!isfree(place)) {
            throw new IllegalStateException("Erreur : la place de parking est invalide.");
        }
        vehicules.put(place, vehicule);
        System.out.println("Véhicule garé à la place " + place + ".");
    }

    public Vehicule liberer(int place) {
        if (place <= 0 || place > capacite) {
            throw new IndexOutOfBoundsException("Erreur : la place de parking est invalide.");
        }
        if (isfree(place)) {
            throw new IllegalStateException("Erreur : la place de parking est invalide.");
        }
        Vehicule vehicule = vehicules.remove(place);
        System.out.println("Véhicule libéré de la place " + place + ".");
        return vehicule;
    }

    public int chercher(Vehicule vehicule) {
        for (Map.Entry<Integer, Vehicule> entry : vehicules.entrySet()) {
            if (entry.getValue().equals(vehicule)) {
                return entry.getKey();
            }
        }
        throw new IllegalStateException("Erreur : le véhicule n'est pas garé dans le parking.");
    }

    // Cette méthode n'est pas de moi, elle a été générée par l'IA pour afficher le parking de manière esthétique. (et j'ai trouvé ça très drôle :))
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔════════════════════════════════════════════════════════════════════════════════════════════════════╗\n");
        sb.append("║                                        PARKING VUE AERIENNE                                        ║\n");
        sb.append("╠════════════════════════════════════════════════════════════════════════════════════════════════════╣\n");

        // Nombre de places par ligne
        int placesParLigne = 3;
        int nbLignes = (capacite - 1) / placesParLigne + 1;

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            // Ligne du haut des places
            sb.append("║ ");
            for (int col = 0; col < placesParLigne; col++) {
                int numeroPlace = ligne * placesParLigne + col + 1;
                if (numeroPlace <= capacite - 1) {
                    sb.append("┌─────────────────────────────┐");
                    if (col < placesParLigne - 1) sb.append("  ");
                }
            }
            sb.append("  ║\n");

            // 6 lignes pour chaque place de parking
            for (int lignePlace = 0; lignePlace < 6; lignePlace++) {
                sb.append("║ ");
                for (int col = 0; col < placesParLigne; col++) {
                    int numeroPlace = ligne * placesParLigne + col + 1;

                    if (numeroPlace > capacite - 1) {
                        sb.append("                               ");
                    } else {
                        sb.append("│");

                        if (isfree(numeroPlace)) {
                            // Place libre - centrage parfait
                            switch (lignePlace) {
                                case 0:
                                case 1:
                                    sb.append("                             ");
                                    break;
                                case 2:
                                    String placeText = "PLACE " + numeroPlace;
                                    int espacesAvant = (29 - placeText.length()) / 2;
                                    int espacesApres = 29 - placeText.length() - espacesAvant;
                                    sb.append(" ".repeat(espacesAvant)).append(placeText).append(" ".repeat(espacesApres));
                                    break;
                                case 3:
                                    String libreText = "LIBRE";
                                    int espacesAvantLibre = (29 - libreText.length()) / 2;
                                    int espacesApresLibre = 29 - libreText.length() - espacesAvantLibre;
                                    sb.append(" ".repeat(espacesAvantLibre)).append(libreText).append(" ".repeat(espacesApresLibre));
                                    break;
                                case 4:
                                case 5:
                                    sb.append("                             ");
                                    break;
                            }
                        } else {
                            // Place occupée - voiture mieux centrée
                            Vehicule v = vehicules.get(numeroPlace);
                            switch (lignePlace) {
                                case 0:
                                    sb.append("    ╔══════════════════════╗ ");
                                    break;
                                case 1:
                                    sb.append("  ╔═╝ ░░░░░░░░░░░░░░░░░░░ ╚═╗");
                                    break;
                                case 2:
                                    sb.append("  ║ ● ░░░░░░░░░░░░░░░░░░░ ● ║");
                                    break;
                                case 3:
                                    sb.append("  ║   ░░░░░░░░░░░░░░░░░░░   ║");
                                    break;
                                case 4:
                                    sb.append("  ╚═╗ ░░░░░░░░░░░░░░░░░░░ ╔═╝");
                                    break;
                                case 5:
                                    sb.append("    ╚══════════════════════╝ ");
                                    break;
                            }
                        }

                        sb.append("│");
                    }

                    if (col < placesParLigne - 1) {
                        sb.append("  ");
                    }
                }
                sb.append("  ║\n");
            }

            // Ligne du bas des places
            sb.append("║ ");
            for (int col = 0; col < placesParLigne; col++) {
                int numeroPlace = ligne * placesParLigne + col + 1;
                if (numeroPlace <= capacite - 1) {
                    sb.append("└─────────────────────────────┘");
                    if (col < placesParLigne - 1) sb.append("  ");
                }
            }
            sb.append("  ║\n");

            // Ligne d'espacement entre les rangées
            if (ligne < nbLignes - 1) {
                sb.append("║                                                                                                    ║\n");
            }
        }

        sb.append("╚════════════════════════════════════════════════════════════════════════════════════════════════════╝\n\n");

        // Affichage détaillé des véhicules
        sb.append("═══════════════════════════════════════════════════════════════════════════════════════════════════════\n");
        sb.append("                                    DÉTAILS DES VÉHICULES GARÉS                                         \n");
        sb.append("═══════════════════════════════════════════════════════════════════════════════════════════════════════\n");

        if (vehicules.isEmpty()) {
            sb.append("                                      Aucun véhicule garé                                             \n");
        } else {
            for (int i = 1; i <= capacite - 1; i++) {
                sb.append(String.format("Place %2d : ", i));
                if (isfree(i)) {
                    sb.append("LIBRE\n");
                } else {
                    Vehicule v = vehicules.get(i);
                    sb.append(String.format("OCCUPÉE - %s\n", v.toString()));
                }
            }
        }

        sb.append("═══════════════════════════════════════════════════════════════════════════════════════════════════════");

        return sb.toString();
    }
}
