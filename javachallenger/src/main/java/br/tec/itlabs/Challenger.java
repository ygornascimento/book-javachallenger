package br.tec.itlabs;

public class Challenger {
    int level;

    public static void main(String[] args) {
        Challenger challenger = new Challenger();
        challenger.level = 7;

        challenger.changeLevel();
        Challenger alternativeChallenger = challenger;

        alternativeChallenger.level = 12;

        System.out.print(challenger.level);
        System.out.print(alternativeChallenger.level);
    }

    void changeLevel() {
        this.level = 9;
    }
}
