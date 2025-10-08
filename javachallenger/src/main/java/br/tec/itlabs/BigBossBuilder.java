package br.tec.itlabs;

public class BigBossBuilder {
    private final String stealthCloth;
    private final String primaryWeapon;
    private final String secondaryWeapon;
    private final String meleeWeapon;
    private final String[] medicineItems;

    public static class Builder {
        private String stealthCloth;
        private String primaryWeapon;
        private String secondaryWeapon;
        private String meleeWeapon;
        private String[] medicineItems;

        public Builder(String stealthCloth, String primaryWeapon) {
            this.stealthCloth = stealthCloth;
            this.primaryWeapon = primaryWeapon;
        }

        Builder withExtraWeapons(String secondaryWeapon, String meleeWeapon) {
            this.secondaryWeapon = secondaryWeapon;
            this.meleeWeapon = meleeWeapon;
            return this;
        }

        Builder withMedicineItems(String[] medicineItems) {
            this.medicineItems = medicineItems;
            return this;
        }

        public BigBossBuilder build() {
            return new BigBossBuilder(this);
        }
    }

    private BigBossBuilder(Builder builder) {
        this.stealthCloth = builder.stealthCloth;
        this.primaryWeapon = builder.primaryWeapon;
        this.secondaryWeapon = builder.secondaryWeapon;
        this.meleeWeapon = builder.meleeWeapon;
        this.medicineItems = builder.medicineItems;
    }

    public String getStealthCloth() {
        return stealthCloth;
    }

    public String getPrimaryWeapon() {
        return primaryWeapon;
    }

    public String getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public String getMeleeWeapon() {
        return meleeWeapon;
    }

    public String[] getMedicineItems() {
        return medicineItems;
    }
}
