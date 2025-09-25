package br.tec.itlabs;

public class ScopeChallenge {
    public static void main(String[] args) {
        boolean isHomerFat = true;

        { String homerFavoriteBeer = "Duff"; }
        
        if (isHomerFat) {
            String homeFavoriteFood = "Doughnuts";
            for (int beersQuantity = 0; beersQuantity <= 10; beersQuantity++) {
                if (isHomerFat)
                    System.out.println(beersQuantity);
                    System.out.println(homeFavoriteFood);
                    System.out.println(isHomerFat);
            }
        }
    }
}
