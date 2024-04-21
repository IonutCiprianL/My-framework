public class DataTypes {
    public static void main(String[] args) {

// Cele mai folosite 5 tipuri de date

        // string = sir de caractere delimitate de " "
        String marca= "Dacia";
        String model= "1310";
        System.out.println(marca + " " + model);

        // integer= numar intreg, notat cu (int)
        int anFabricatie= 1987;

        // double= numar zecimal
        double pret= 2300.5;

        // boolean= adevarat (1) sau fals (0)
        boolean inmatriculata= true;
        inmatriculata= false;

        // char= un singur caracter
        char nota= 'A';

        // Am gasit lungimea unui string
        System.out.println(marca.length());

        // Am printat un sir cu litere mici si mari.
        System.out.println(marca.toLowerCase());
        System.out.println(marca.toUpperCase());


    }
}
