import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Liste {
    public static void main(String[] args) {


// declaram o lista goala

        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add ("mar");
        fructe.add("banana");
        fructe.add("portocala");


        System.out.println(fructe.get(0));// printeaza "mar"

// cum se afla indexul banana
        System.out.println(fructe.indexOf("banana"));

        // Lista este goala ?
        System.out.println(fructe.isEmpty());


        if(!fructe.isEmpty()) {// daca fructe NU este goala
            System.out.println("Cosul este plin");
        }
else{
            System.out.println("Cosul este gol.");
        }

// eliminam toate elementele din lista
        fructe.clear();

  if(!fructe.isEmpty()) {// daca fructe NU este goala
            System.out.println("Cosul este plin");
        }
else{
            System.out.println("Cosul este gol.");
        }

 // adaugam elemente in lista
        fructe.add ("mar");
        fructe.add("banana");
        fructe.add("portocala");
// scoatem un element
        fructe.remove("mar");
// listam elementele
        System.out.println(Arrays.toString(fructe.toArray()));


        // aflam dimensiunea listei
        System.out.println(fructe.size());


// declaram o lista si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));




        // declaram o lista dinamica
        String[] flowers = {"Ageratum","Allium","Poppy","Catmint"};
        List<String> flowerList= new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(Arrays.toString(flowerList.toArray()));


// aflam indexul lui Poppy
        int poppy_index=flowerList.indexOf("Poppy");
      // stergem ce este in cea pozitie
        flowerList.remove(poppy_index);

// scoatem din functie o valoare
        flowerList.remove("Catmint");
             System.out.println(Arrays.toString(flowerList.toArray()));



        // variante actualizate de printare

        System.out.println("variante actualizate de printare");

          // declaram o lista dinamica
        String[] flowers2 = {"Ageratum","Allium","Poppy","Catmint"};
        List<String> flowerList2= new ArrayList<>(Arrays.asList(flowers2));
        flowerList.add("Rose");
       System.out.println(flowerList2); // variante actualizate de printare

        flowerList2.remove("Catmint");
        System.out.println(flowerList2); // variante actualizate de printare

        // declaram o lista si o initializam cu valori
        List<Integer> numere3 = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(numere3);// variante actualizate de printare

        // declaram o lista imutabila si o initializam cu valori
        List<Integer> numere2 = Arrays.asList(new Integer[]{1, 33, 77});
        numere.add(99);
        System.out.println(Arrays.toString(numere2.toArray()));

    }
}
