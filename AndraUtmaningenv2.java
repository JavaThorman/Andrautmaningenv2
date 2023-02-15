import java.util.Scanner;
public class AndraUtmaningenv2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //  Du ska använda && (AND), || (OR), Continue, Break, If, For eller While

        // Du har en lista på 10 personer, med namn och ålder.
        //         Du ska skriva ett program som går igenom listan med personer och skriver ut alla personer som uppfyller vissa kriterier.




        //  5. Visa en lista på alla personer som har jämna tal i sin ålder
        //  6. Visa alla namn men stoppa körningen vid första person över 40 år.

        //          För att skona dig från tråkdelen så får du en färdig lista här som exempel:

        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] < 20) {
                // 1. Skriv ut alla personer som är under 20 år.
                System.out.println("Personer under  20\n------------------");
                System.out.println(namn[i] + " - " + ålder[i]);
                System.out.println("------------------\n");
                break;
            }
        }
        // 2. Skriv ut alla personer som är 20 år och alla som är under 30 år.
            for (int i = 0; i < namn.length; i++) {
                if (ålder[i] <= 29 && ålder[i] > 19) {

                    System.out.println("Personer över 20, under 30\n------------------");
                    System.out.println(namn[i] + " - " + ålder[i]);
                    System.out.println("---------------- break");
                }


            }        //  3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
        for (int i = 0; i < namn.length; i++) {
            if (ålder[i] <= 29 && ålder[i] > 19) {

                System.out.println("Personer över 20, under 30\n------------------");
                System.out.println(namn[i] + " - " + ålder[i]);
                System.out.println("---------------- break");
            }


        }
        //  4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
    }
}