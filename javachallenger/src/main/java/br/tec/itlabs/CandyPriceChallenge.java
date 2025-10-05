package br.tec.itlabs;

public class CandyPriceChallenge {
    public static void main(String[] args) {
        int dollarToSpend = 20;
        int candyCount = 0;
        int candySum = 0;
        int candyPrices[] = {9,5,2,6,4,1,2,8,3,7};
        int lentghOfPrices = candyPrices.length;

        for (int i = 0; i < lentghOfPrices -1; i++) {
            for (int j = 0; j < lentghOfPrices - i - 1; j++) {
                if (candyPrices[j] > candyPrices[j+1]) {
                    int temp = candyPrices[j];
                    candyPrices[j] = candyPrices[j+1];
                    candyPrices[j+1] = temp;
                }
            }
        }

        for (int price: candyPrices) {
            if (candySum + price <= dollarToSpend) {
                candySum += price;
                candyCount++;
            } else {
                break;
            }
        }

        System.out.println("Candies bought: " + candyCount + " total spent: " + candySum);
    }
}
