import java.util.Random;
import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 * 
 * Vihje: http://i200.itcollege.ee/#Mathrandom
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        kullvoikiri();

    }

    public static void kullvoikiri() {
        Random generaator = new Random();
        int vastus= generaator.nextInt(2)+1;
        System.out.println("Kas 1 või 2");
        int pakkumine=(new Scanner(System.in)).nextInt();
        if (pakkumine == vastus) {
            System.out.println("Pakkusid õigesti");
        }
        else {
            System.out.println("Pakkusid valesti");
        }
    }
}
