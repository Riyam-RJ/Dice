import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        /**
         * This is the main() method that deals with our Dice class
         */

        /**
         * create new output file and data objects to store the analysis results
         */
        FileOutputStream myFile1 = new FileOutputStream("riyam2.txt");
        DataOutputStream myData1 = new DataOutputStream(myFile1);

        /**
         * create new Dice object
         * and allocate memory for our arrays (Buffer and Frequency)
         */
        Dice myDice=new Dice();
        int[] Buffer=new int[1000];
        int[] Frequency=new int[6];

        /**
         * Call Dice methods to generate Frequency array (list of probability)
         */
        myDice.createFile();
        Buffer=myDice.createArray();
        Frequency=myDice.analysisArray(Buffer);

        /**
         * Display the 1000 random number and its frequency on terminal
         */
        System.out.println(Arrays.toString(Buffer));
        System.out.println(Arrays.toString(Frequency));

        /**
         * Store the results in a text file
         */
        myData1.writeChars("uppgift 2 Frekvenstabell by: Riyam Riyadh Jabbar \n\n");
        myData1.writeChars("Frequency Table = " + Arrays.toString(Frequency)+"\n\n");
        for(int i=0;i<6;i++) {
            double prob=(double) Frequency[i]/1000;
            String str="Probability of "+ (i+1) +" = " + prob;
            System.out.println(str);
            myData1.writeChars(str+"\n");
        }
        myFile1.close();
    }
}
