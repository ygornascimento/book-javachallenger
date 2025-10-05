package br.tec.itlabs;

public class BatMobile {

    String versionName;
    int modelYear;

    BatMobile(String versionName, int modelYear) {
        this.versionName = versionName;
        this.modelYear = modelYear;
    }

    BatMobile() {
        this("Batman Forever", 1995);
    }

    public static void main(String[] args) {
        BatMobile batmanForever = new BatMobile();
        batmanForever.printBatMobileDescription();

        BatMobile batmanArkhamKnight = new BatMobile("Arkham Knight", 2014);
        batmanArkhamKnight.printBatMobileDescription();
    }

    void printBatMobileDescription() {
        System.out.println("Version name: " + this.versionName + "Model Year: " + this.modelYear);
    }
}
