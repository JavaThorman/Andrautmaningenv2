import java.util.Scanner;

public class AndraUtmaningenv2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Du ska använda && (AND), || (OR), Continue, Break, If, For eller While



        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};



        // 1. Skriv ut alla personer som är under 20 år.
        System.out.println("Personer under 20\n------------------");
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] < 20) {
                System.out.println(namn[i] + " - " + ålder[i]);
            }
        }
        System.out.println("------------------\n");


        // 2. Skriv ut alla personer som är 20 år och alla som är under 30 år.
        System.out.println("Personer över 20, under 30\n------------------");
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] >= 20 && ålder[i] < 30) {
                System.out.println(namn[i] + " - " + ålder[i]);
            }
        }
        System.out.println("------------------\n");



        // 3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
        System.out.println("Personer under 20 år, och alla äldre än 29 år\n------------------");
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] < 20 || ålder[i] > 29) {
                System.out.println(namn[i] + " - " + ålder[i]);
            }
        }
        System.out.println("------------------\n");



        // 4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
        int yngst = 0;
        int äldst = 0;

        for (int i = 1; i < namn.length; i++) {
            if (ålder[i] < ålder[yngst]) {
                yngst = i;
            }
            if (ålder[i] > ålder[äldst]) {
                äldst = i;
            }
            // Printa alla under 40 i ordning
            if (ålder[yngst] > 40) {
                System.out.println(ålder[yngst] + " - " + namn[i]);

            }
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Äldsta karaktären:\n" + namn[äldst] + " - " + ålder[äldst]);
        System.out.println("\n");
        System.out.println("Yngsta karaktären:\n" + namn[yngst] + " - " + ålder[yngst]);
        System.out.println("\n");



// 6. Visa alla namn men stoppa körningen vid första person över 40 år.
        // Slutar köra efter Elena då
        System.out.println("Alla under 40\n------------------");

            for (int i = 0; i < namn.length; i++) {
                System.out.println(namn[i] + "-" + ålder[i]);

                if (ålder[i] >= 40) {
                    System.out.println(namn[i] + "-" + ålder[i]);
                    continue;
                }
                break;
            }
            System.out.println("------------------\n");

        }



    }
}