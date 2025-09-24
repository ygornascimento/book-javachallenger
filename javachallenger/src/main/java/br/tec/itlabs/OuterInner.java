package br.tec.itlabs;

public class OuterInner {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            inner:
            for (int j = 0; j < 2; j++) {
                if (j == 2) {
                    continue inner;
                }
                if (i >= 3) {
                    break outer;
                }

                System.out.println(i + ":" + j);
            }
        }
    }
}
