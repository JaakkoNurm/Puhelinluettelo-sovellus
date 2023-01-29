import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class puhelinluettelo {
    public static void main(String[] args) {
        HashMap<String, String> numerot = new HashMap<>();
        Scanner lukija = new Scanner(System.in);
    
        while (true) {
            System.out.println("1. Lisää numero");
            System.out.println("2. Etsi numero");
            System.out.println("3. Listaa numerot");
            System.out.println("0. Poistu");
            
            System.out.print("Valinta: ");
            int valinta = Integer.valueOf(lukija.nextLine());
            
            if (valinta == 0) {
                break;
            } else if (valinta == 1) {
                lisaaNumero(numerot);
                System.out.println();
            } else if (valinta == 2) {
                etsiNumero(numerot);
                System.out.println();
            } else if (valinta == 3) {
                listaa(numerot);
                System.out.println();
            }
        }
}

    public static void lisaaNumero(HashMap<String, String> numerot) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        System.out.print("Numero: ");
        String numero = lukija.nextLine();
        
        numerot.put(nimi, numero);
    }

    public static void etsiNumero(HashMap<String, String> numerot) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        String numero = numerot.get(nimi);
        
        if (numero != null) {
            System.out.println("Numero: " + numero);
        } else {
            System.out.println("Nimeä ei löydy");
        }
    }

    public static void listaa(HashMap<String, String> numerot) {
        ArrayList<String> avaimet = new ArrayList<>(numerot.keySet());
        Collections.sort(avaimet);
        
        for (String nimi : avaimet) {
            System.out.println("Nimi: " + nimi + ", Numero: " + numerot.get(nimi));
        }
    }
    
}