package br.tec.itlabs;

public class IronManBuilder {
    private final String name;
    private final int age;
    private final String car;
    private final String specialWeapon;

    public static class Builder {
        private String name;
        private int age;
        private String car;
        private String specialWeapon;

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withAge(int age) {
            this.age = age;
            return this;
        }

        Builder withCar(String car) {
            this.car = car;
            return this;
        }

        Builder withSpecialWeapon(String specialWeapon) {
            this.specialWeapon = specialWeapon;
            return this;
        }

        public IronManBuilder build() { return new IronManBuilder(this); }
    }

    private IronManBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.car = builder.car;
        this.specialWeapon = builder.specialWeapon;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCar() {
        return car;
    }

    public String getSpecialWeapon() {
        return specialWeapon;
    }
}
