import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files

public class hovedprog {
    public static void main(String[] args) throws Exception {

        //alle filene som variabler
        String nearly_sorted_10 = "inputs/nearly_sorted_10";
        String nearly_sorted_100 = "inputs/nearly_sorted_100";
        String nearly_sorted_1000 = "inputs/nearly_sorted_1000";
        String nearly_sorted_10000 = "inputs/nearly_sorted_10000";
        String nearly_sorted_100000 = "inputs/nearly_sorted_100000";
        String nearly_sorted_1000000 = "inputs/nearly_sorted_1000000";
        String random_10 = "inputs/random_10";
        String random_100 = "inputs/random_100";
        String random_1000 = "inputs/random_1000";
        String random_10000 = "inputs/random_10000";
        String random_100000 = "inputs/random_100000";
        String random_1000000 = "inputs/random_1000000";
        String valgt = null;

        System.out.println("velg fil: \n1. nearly_sorted_10 \n2. nearly_sorted_100 \n3. nearly_sorted_1000 \n4. nearly_sorted_10000 \n5. nearly_sorted_100000 \n6. nearly_sorted_1000000\n7. random_10\n8. random_100\n9. random_1000\n10. random_10000\n11. random_100000\n12. random_100000");

        Scanner filvalg = new Scanner(System.in);


    while(valgt == null){
        String valg = filvalg.nextLine();
        if(valg.equals("1")){
            valgt = nearly_sorted_10;
        }
        else if(valg.equals("2")){
            valgt = nearly_sorted_100;
        }
        else if(valg.equals("3")){
            valgt = nearly_sorted_1000;
        }
        else if(valg.equals("4")){
            valgt = nearly_sorted_10000;
        }
        else if(valg.equals("5")){
            valgt = nearly_sorted_100000;
        }
        else if(valg.equals("6")){
            valgt = nearly_sorted_1000000;
        }
        else if(valg.equals("7")){
            valgt = random_10;
        }
        else if(valg.equals("8")){
            valgt = random_100;
        }
        else if(valg.equals("9")){
            valgt = random_1000;
        }
        else if(valg.equals("10")){
            valgt = random_10000;
        }
        else if(valg.equals("11")){
            valgt = random_100000;
        }
        else if(valg.equals("12")){
            valgt = random_1000000;
        }
        else {
            System.out.println("Feil tastetrykk");
        }
    }

        
        //leser antall linjer i filen 
        Scanner les = new Scanner(new File(valgt));
        int antallLinjer = 0; 
        while(les.hasNextLine()){
            les.nextLine();
            antallLinjer++;
        }
        les.close();
        
        int[] sorter = new int[antallLinjer];
        int peker = 0;

        les = new Scanner(new File(valgt));
        while(les.hasNextLine()){
            sorter[peker] = Integer.parseInt(les.nextLine());
            peker++;
        }

        InsertionSort InS = new InsertionSort(sorter);
        long startTime = System.nanoTime();
        InS.sorter();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        for (int i : InS.sorter) {
            System.out.println(i);
        }
        System.out.println("det tok: " + (duration / 1000000) + " millisekunder");
    }
}