package br.tec.itlabs;

public class IronManExecutor {
    public static void main(String[] args) {
        IronManBuilder ironMan = new IronManBuilder.Builder().withName("Mark 42")
                .withAge(5)
                .withCar("Audi")
                .withSpecialWeapon("Laser")
                .build();

        System.out.printf("%s, %d, %s, %s", ironMan.getName(), ironMan.getAge(), ironMan.getCar(), ironMan.getSpecialWeapon());
    }
}
