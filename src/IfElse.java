import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

         // Flow control - if else, evalueaza conditii si bifurca codul dupa rezultat

        System.out.println("Pornim radio");
        // Daca imi place muzica, dau mai tare : se traduce in cod

        boolean piesa_faina = true;

        if (piesa_faina== true){
            System.out.println("Dau muzica mai tare");
            System.out.println("Fredonez");
        }
        System.out.println("Opresc radioul");

        // if else

        int numar = 5 ;

        if (numar % 2 == 0){
            System.out.println("numar par");
        } else {
            System.out.println("numar impar");
        }

        // if, else if, else
        // luam date de la tastatura

        Scanner sc=new Scanner(System.in);
        int ora= sc.nextInt();
        if(ora<0){
          System.out.println("Ora invalida");
        }
else if(ora<=11){
            System.out.println("Buna dimineata");
        }
else if (ora<=18){
            System.out.println("Buna ziua");
        }
else if (ora<=21){
            System.out.println("Buna seara");
        }
else if (ora<=24){
            System.out.println("Noapte buna");
        }
else {
            System.out.println("Ora este prea mare");
        }

       // switch se foloseste cand se stiu valorile posibile

        System.out.println("Alege o optiune");
int optiune= sc.nextInt();
switch(optiune){
    case 0:
        System.out.println("Meniu principal");
        break;
    case 1:
        System.out.println("Ati ales limba romana");
        break;
    case 2:
        System.out.println("Ati ales limba engleza");
        break;
    default:
        System.out.println("Nu am identificat optiunea. Mai incercati");


}





    } // inchide functia main
} // inchide clasa
