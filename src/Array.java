public class Array {
    public static void main(String[] args) {

        String[] elevi = {"Gigel", "Marcel", "Ada", "Ela", "Mihai"}; // de la 0 .....4
        int[] numere = {1, 33, 81, 99, 201}; // de la 0 .....4


        System.out.println(elevi[3]);
        System.out.println(numere[2]);

        elevi[3]= "Maria";  // suprascriere in array la pozitia 3
        System.out.println(elevi[3]);

        System.out.println(elevi[0] + " " + elevi[4]);
        System.out.println(elevi.length + 5); // valoarea sirului elevi plus 5

        System.out.println("Ultimul loc : " + elevi[elevi.length-1]); //  elevi [4]  => Mihai
// index intre []

        int[] note = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(note[1]);

        note[0] = 10;
        note[1] = 9;



    }
}
