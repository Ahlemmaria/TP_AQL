package org.example;

public class Banquee implements Banque {
    private int fond;
    private final int fondMinimum;

    public Banquee(int fond, int fondMinimum) {
        this.fond = fond;
        this.fondMinimum = fondMinimum;
    }

    @Override
    public void crediter(int somme) {
        fond += somme;
    }

    @Override
    public boolean est_solvable() {
        return fond >= fondMinimum;
    }

    @Override
    public void debiter(int somme) {
        fond -= somme;
    }
}

