import java.util.Scanner;

/**
 * Created by Kersti on 29.10.2016.
 */
public class Kalkulaator {
    public static void main(String[] args) {

        Scanner skanner=new Scanner(System.in);

        System.out.println("Sisesta esimene arv");
        int a = skanner.nextInt();
        System.out.println("Sisesta tehe");
        skanner.nextLine();
        String tehe = skanner.nextLine();
        System.out.println("Sisesta teine arv");
        int b = skanner.nextInt();

        if (tehe.equals("+")) {
            int tulemus = a+b;
            System.out.println(tulemus);
        }
        else if (tehe.equals("-")) {
            int tulemus = a-b;
            System.out.println(tulemus);
        }
        else if (tehe.equals("*")) {
            int tulemus = a*b;
            System.out.println(tulemus);
        }
        else if (tehe.equals("/")) {
            int tulemus = a/b;
            System.out.println(tulemus);
        }
        else {
            System.out.println("Error");
        }

    }
}
