import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kersti on 13.11.2016.
 */
public class Arvuarvamine {
    public static void main(String[] args) {


        arva();
    }

    public static void arva() {

        Random generaator = new Random();
        int arv = generaator.nextInt(100) + 1;
        System.out.println("Paku arv vahemikus 1 kuni 100");
        Scanner skanner= new Scanner(System.in);
        int pakkumine = skanner.nextInt();

        while (true) {
            if (pakkumine < arv) {
                System.out.println("Pakutud arv on liiga väike, proovi uuesti");
                pakkumine = skanner.nextInt();
            } else if (pakkumine > arv) {
                System.out.println("Pakutud arv on liiga suur, proovi uuesti");
                pakkumine = skanner.nextInt();
            } else {
                System.out.println("Arvasid õigesti! Palju õnne!");
                skanner.close();
                return;
            }
        }

    }
}
