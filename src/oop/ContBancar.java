package oop;

public class ContBancar {
    // OOP - object oriented programming
    // poo - programare orientata pe obiecte
    //obiect - implementarea clasei
    // fields - atribute, variabile, proprietati
    // metode - actiuni ce pot fi facute de obiecte
    // functiile pe care le cunoastem : accelereaza, vand, cumpara


    // acestea sunt proprietatile / atribute / fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777; // pinul n-o sa fie public, ci ascuns
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si  * din formular, required fields, mandatory / obligatoriu
public ContBancar(String titularCont, String iban) {

    // definire la nivel superior, de clasa pentru utilizare la apelare oriunde in program
    this.titularCont = titularCont;
    this.iban = iban;
}

// metode - actiunile clasei


    public void interogareSold() {
        System.out.println();
        System.out.println("Titular : " + this.titularCont);
        System.out.println("IBAN : " + this.iban);
        System.out.println("Sold : " + this.sold);
        if (this.activ == true) {
            System.out.println("Status : Activ");
        } else {
            System.out.println("Status : Inactiv");
        }
        System.out.println("Incercari gresite : " + this.incercari_activare);
        System.out.println("______________________________");

    }


    public void activareCont(int pinUtilizator) {

        // modifica activ in true doar daca pinul este corect
        if (pinUtilizator == this.pin) {
            System.out.println("Cardul a fost activat cu succes");
            this.activ = true;
        } else {
            System.out.println("PIN incorect");
            this.incercari_activare++; // incrementare
        }

    }

    public void alimentareCont(double suma_depusa){
    // la this.sold se mai adauga suma_depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Ati depus cu succes suma : " + suma_depusa);
        System.out.println("Aveti in cont suma de : "+ this.sold);
    }

    public void plata_card(double suma_cheltuita){
        System.out.println("Buna "+ this.titularCont);
        // pot sa cheltuiesc doar ce am
        // daca suma cheltuita <= sold
        if (suma_cheltuita <= this.sold) {
            // dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit "+ suma_cheltuita);
            System.out.println("Mai ai in cont "+ this.sold);
        }else{
            System.out.println("Fonduri insuficiente");

        }

    }

    // inheritance - mosteniri
    // polimorphism
    // encasulation
    // abstractization
}
