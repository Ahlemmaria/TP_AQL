package org.example;

public class Jeu {
    private Banque laBanque;
    private boolean ouvert;

    public Jeu(Banque laBanque) {
        this.laBanque = laBanque;
        this.ouvert = true;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if (!estOuvert()) {
            throw new JeuFermeException("Le jeu est fermé.");
        }

        try {
            int mise = joueur.mise();
            joueur.debiter(mise);

            int resultat = de1.lancer() + de2.lancer();
            if (resultat == 7) {
                joueur.crediter(mise * 2);
                if (!laBanque.est_solvable()) {
                    fermer();
                }
            } else {
                fermer();
            }
        } catch (DebitImpossibleException e) {
            fermer();
            throw new JeuFermeException("Le joueur est insolvable.");
        }
    }


    public void fermer() {
        ouvert = false;
    }

    public boolean estOuvert() {
        return ouvert;
    }
}
