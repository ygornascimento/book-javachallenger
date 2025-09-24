package br.tec.itlabs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int bartAge = 10;
        double bartMoney = 20;

        boolean isBartWithCinemaTicket = false;
        boolean isBartWithMoney = true;

        if (bartAge >= 12 && bartMoney++ >= 10) {
            System.out.println("Bart can go to the cinema.");
        }

        if (isBartWithCinemaTicket || isBartWithMoney) {
            System.out.println("Bart can watch a movie at Cinema.");
        }

        System.out.println(bartMoney);
    }
}