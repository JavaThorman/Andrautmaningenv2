public class AndraUtmaningenv2 {

    public static void main(String[] args) {

        //    for (int i = 0; i < 11; i++) {
        //      if (i == 5) {
        //        continue;
        //  }
        //System.out.print("Nästa tal är: ");
        //System.out.println(i); }

        // System.out.println("Hej!");


        // En lärare som granskar elevuppgifter och vill hoppa över en elevs
        //Svar för att gå vidare till nästa. Här kan break användas för
        // att avsluta loopen och continue användas för att hoppa över en
        // specifik iteration.
        String[] namn = {"Harry Potter", "Hermione Granger", "Ron Weasley", "Luna Lovegood", "Draco Malfoy", "Neville Longbottom", "Ginny Weasley", "Fred Weasley", "George Weasley", "Cho Chang"};
        String[] svar = {"OK", "OK", "OK", "OK", "", "OK", "", "OK", "", "OK"};


        for (int k = 0; k < svar.length; k++) {
            for (int i = 0; i < namn.length; i++) {
                if (svar[k].equals("OK")) {
                    System.out.println(namn[i]);System.out.println(svar[k]);
                    continue;
                }

                }

            }
        }
    }


