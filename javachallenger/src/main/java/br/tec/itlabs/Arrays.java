package br.tec.itlabs;

public class Arrays {
    public static void main(String[] args) {
//        String[] simpsonCharacterNames = {"Moe", "Burns", "Bart"};
//
//        for (int i = 0; i < simpsonCharacterNames.length; i++) {
//            System.out.println(simpsonCharacterNames[i]);
//        }
//
//        int i = 0;
//
//        while (i < simpsonCharacterNames.length) {
//            System.out.println(simpsonCharacterNames[i++]);
//        }
//
//        for (String eachCharacterName: simpsonCharacterNames) {
//            System.out.println(eachCharacterName);
//        }

        //Challenge  - A: exception will be thrown
        String[] marioCharacters = new String[3];

//        marioCharacters[1] = "Mario";
        marioCharacters[0] = "Mario";
//        marioCharacters[2] = "Luigi";
        marioCharacters[1] = "Luigi";
//        marioCharacters[3] = "Peach";
        marioCharacters[2] = "Peach";

        for (String marioCharacter: marioCharacters) {
            System.out.println(marioCharacter);
        }
    }
}
