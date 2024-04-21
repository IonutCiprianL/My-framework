package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop
        // initializam obiecte de tip cont bancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Ana", "Ro001");
        ContBancar cont2 = new ContBancar("Dan", "Ro002");


        System.out.println();
        cont1.activareCont(7777); // introducem codul PIN si activam contul
        cont1.alimentareCont(300.5); // alimentam contul
        cont1.plata_card(500);   // negative testig
        cont1.interogareSold(); // apelam metoda descriere


        System.out.println();
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);
        cont2.plata_card(100);   // positive testig
        cont2.plata_card(200);   // positive testig
        cont2.interogareSold();







    }



}
