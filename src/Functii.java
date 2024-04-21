public class Functii {

        // functie - logica delimitata care poate fi refolosita
        // nu se pot folisi spatii in nume
        // nu se poate defini o functie in alta functie



        public static void printGreeting() {
            System.out.println("Buna ziua Bine ati venit !");
        }

         // o functie care saluta clientul in functie de numele lui
        //nu ne da niciun raspuns (nu are return)
        // are nevoie de parametri
        public static void printGreetingByName(String nume, String prenume) {
            System.out.println("Buna ziua," + " " + nume+" "+prenume+" !");

        }

        // o functie care calculeaza suma a 3 numere
        // ne da un raspuns - suma nr. va avea return
        // are nevoie de parametri
    // ce tip de date va avea raspunsul ? int

        public static double mediaNr(double a, double b, double c){
            double media = (a + b+ c)/3;
            return media;
        }
        public static double dreptunghiNR(double L, double l){
            double ariaD =L*l;
            return ariaD;
        }
         public static double cercNR(double R){
            double ariaC =piValue()*R*R;
            return ariaC;
        }
         public static double sumaNR(double x, double y){
            double sumaxy =x+y;
            return sumaxy;
        }


        // o functie care ne da valoarea lui pi
        // ne da un raspuns
        // raspuns double
        // nu are nevoie de parametri
    public static double piValue(){
            double pi=3.14;
            final double PI = 3.14;//- constanta nu poate fi suprascrisa. se noteaza cu majuscule
            return 3.14;


    }


        public static void main(String[] args){
            // intra clientul 1
            printGreeting(); // se apeleaza functia

            // intra clientul 2
            printGreeting(); // CTRL + Click pe functie ne nuce la corpul ei

         // apelam o functie cu parametri, oferind argumente
            printGreetingByName("Petre", "Ion");
            printGreetingByName("Albu", "Ana");
            printGreetingByName("Pop", "Dan");

            System.out.println(mediaNr(3, 3, 3 ));

            double media1 = mediaNr(122, 456, 789);
            double media2 = mediaNr(32, 44,55);
            double media3 = mediaNr(88, 78, 67);
            System.out.println(media1);
            System.out.println(media2);
            System.out.println(media3);

            System.out.println(piValue());
            System.out.println(piValue());

            // aria unui dreptunghi
            double aria_dreptunghi= dreptunghiNR(72, 40);
            System.out.println("Aria dreptunghiului este "+aria_dreptunghi);

            // aria cercului
            double aria_cercului = cercNR(15);
            System.out.println("Aria cercului este egala cu "+aria_cercului);

            //suma a doua numere
            double c = sumaNR(32, 44);
            System.out.println("Suma numerelor este "+c);

            //o functie care returneaza nr de caractere pt nume si prenume
           String nume= "Petre";
           String prenume= "Ana";
           System.out.println("Numele "+nume+" are "+nume.length()+" caractere.");
           System.out.println("Prenumele "+prenume+" are "+prenume.length()+" caractere.");

    }
}
