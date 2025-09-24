package br.tec.itlabs;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i >= 3) {
                System.out.println("Goku beats one Majin Buu with " + i + " hits.");
                break;
            }
            System.out.println("Goku hits Majin Buu");
        }
    }
}
