public class For {
    public static void main(String[] args) {
       // for - loop, structura repetitiva
       // de unde incepem ?
        // pana unde mergem ?
        // pasul de parcuregere

        // problema : printam 101 dalmatieni
        for (int i=1; i<=101; i++){
            System.out.println("Dalmatianul cu nr "+ i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[]numere = {3, 7, 3,7};
        System.out.println(numere);
        for (int i = 0; i<numere.length; i++) {
            System.out.println("elementul cu index " + i + " si valoarea " + numere[i]);
        }

         // ne ajuta sa parcurgem un array prin intermediul indexului din 2 in 2
        int[]numere3 = {3, 7, 10, 20, 30};
        System.out.println(numere3);
        for (int i = 0; i<numere3.length; i=i+2) { //incrementare cu 2
            System.out.println("elementul cu index " + i + " si valoarea " + numere3[i]);
        }

        // for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar : numere3){
            System.out.println("Numarul este: " + numar);

        }

        // parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori){
            System.out.println("Culoarea actuala este " + culoare);
        }

        // suma numerelor din array
        int s=0;
        for (int numar : numere){
            s = s + numar;
        }
        System.out.println(s);




    }
}
