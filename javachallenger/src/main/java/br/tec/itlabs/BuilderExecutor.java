package br.tec.itlabs;

public class BuilderExecutor {
    public static void main(String[] args) {
        BigBossBuilder bigBoss = new BigBossBuilder.Builder("Military uniform", "Mk22")
                .withExtraWeapons("Ak-47", "CQC Knife")
                .withMedicineItems(new String[] {"First Aid Kit"})
                .build();

        System.out.printf("%s , %s ,%s , %s , %s", bigBoss.getStealthCloth(),
                bigBoss.getPrimaryWeapon(), bigBoss.getSecondaryWeapon(),
                bigBoss.getMeleeWeapon(), bigBoss.getMedicineItems()[0]);
    }
}
