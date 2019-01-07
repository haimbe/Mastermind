package Mastermind;
import java.util.Scanner;


public class Challenger extends Mastermind.Combinaison {
    int chiffre1, chiffre2, chiffre3, chiffre4;

    public void Challenger(){
        this.chiffre1=0;
        this.chiffre2=0;
        this.chiffre3=0;
        this.chiffre4=0;



    }

    public Challenger computer() {

        Challenger computer = new Challenger();

        setChiffre1(1);
        setChiffre2(2);
        setChiffre3(3);
        setChiffre4(4);


    };

    public Challenger createJ1() {

        Challenger j1= new Challenger();

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre premier chiffre");
        int chiffre1=sc.nextInt();
        setChiffre1(chiffre1);
        System.out.println("Veuillez entrer votre second chiffre");
        int chiffre2=sc.nextInt();
        setChiffre2(chiffre2);
        System.out.println("Veuillez entrer votre troisième chiffre");
        int chiffre3=sc.nextInt();
        setChiffre3(chiffre3);
        System.out.println("Veuillez entrer votre quatrième chiffre");
        int chiffre4=sc.nextInt();
        setChiffre4(chiffre4);


    };

    public Challenger challengerChecking(){

        char result1, result2, result3, result4;
        String resultat = "default";



        if(createJ1().chiffre1 > computer().chiffre1){
            result1=+ ;}
        else if (createJ1().chiffre1 < computer().chiffre1){
            result1=-;}
        else if (createJ1().chiffre1 == computer().chiffre1){
            result1 = = ;}

            setresult1(this.result1);

        if(createJ1().chiffre2 > computer().chiffre2){
            result2=+ ;}
        else if (createJ1().chiffre2 < computer().chiffre2){
            result2=-;}
        else if (createJ1().chiffre2 == computer().chiffre2){
            result2 = = ;}

        setresult1(this.result2);

        if(createJ1().chiffre3 > computer().chiffre3){
            result3=+ ;}
        else if (createJ1().chiffre3 < computer().chiffre3){
            result3=-;}
        else if (createJ1().chiffre3 == computer().chiffre3){
            result3 = = ;}

        setresult1(this.result3);

        if(createJ1().chiffre4 > computer().chiffre4){
            result4=+ ;}
        else if (createJ1().chiffre4 < computer().chiffre4){
            result4=-;}
        else if (createJ1().chiffre4 == computer().chiffre4){
            result4 = = ;}

        setresult1(this.result4);

        resultat = new String("getresult1()"+"getresult2()"+"getresult3()"+"getresult4()");
        

         System.out.println(getresult1()+getresult2()+getresult3()+getresult4());


        }

    }



}
