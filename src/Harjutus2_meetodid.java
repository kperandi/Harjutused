import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 * tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 * Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 * arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        kasutajaSisestus("Sisesta arv", 2, 10);
    }

    public static double tostaKuupi(int arv) {
        int vastus = arv * arv * arv;
        return vastus;
    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {
        System.out.println(kysimus);
        Scanner scan = new Scanner(System.in);
        int vastus = scan.nextInt();
        while (true) {
            if ((vastus > min) && (vastus < max)) {
                return vastus;
            } else {
                System.out.println(kysimus);
                vastus = scan.nextInt();
            }
        }
    }
}
