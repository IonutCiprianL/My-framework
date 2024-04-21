public class operatori {
    public static void main(String[] args) {

        /*
        Operatori aritmetici +, -, *, /, %
        Operatori de comparare >, <, ==, !=, >=, <=
        Operatori logici &&, ||
         */

        int a=5; // declarare si initializare
        int b=3;  // declarare si initializare
        a= b; // suprascriere
        a=5;

// operatori aritmetici
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

// Operatori de comparare
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Operatori logici
        System.out.println(a>b && b<a);
        System.out.println(a>b && b==a);
        System.out.println(a>b || a<b);
        System.out.println(a !=b && (b<=a || a==b));
        System.out.println((a>b && a != b) && (b>a || a == b));
        System.out.println(!((a>b && a != b) && (b>a || a == b)));










    }
}
