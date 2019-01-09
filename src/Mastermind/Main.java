package Mastermind;

public class Main {

    public static void main(String[] args) {

        String resultat = "default";

        Challenger challenger = new Challenger();


        while (!challenger.challengerChecking().equals("++++")) {

            challenger.createJ1();

        }


    }
}

