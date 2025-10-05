package br.tec.itlabs;

public class ResidentEvilNameChangeChallenge {

    String name = "Nemesis";

    ResidentEvilNameChangeChallenge(String name) {
        name = name;
    }

    public static void main(String[] args) {
        ResidentEvilNameChangeChallenge residentEvilNameChange = new ResidentEvilNameChangeChallenge("Leon");

        System.out.println(residentEvilNameChange.name);

        residentEvilNameChange.changeName("Claire");

        System.out.println(residentEvilNameChange.name);
    }

    void changeName(String name) {
        this.name = this.name;
    }
}
