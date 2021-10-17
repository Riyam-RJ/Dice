import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class Dice {

    public void createFile() throws Exception {
        /**
         * createFile () method: create 1000 random numbers between 1 and 6.
         * this method also creates .txt file that contains all numbers in a row
         * input: void
         * return: void
         * using throws Exception to handle the file I/O errors
         */

        int number;

        /**
         * create new random object
         */
        Random random = new Random();

        /**
         * create new output file and data objects
         */
        FileOutputStream myFile = new FileOutputStream("riyam1.txt");
        DataOutputStream myData = new DataOutputStream(myFile);

        /**
         * generate 1000 random numbers (1-6)
         * and store them as string in a  text file
         */
        for (int i = 0; i < 1000; i++) {
            number = random.nextInt(6) + 1;
            myData.writeChars(Integer.toString(number));
        }
        myFile.close();
    }

    public int[] createArray() throws Exception {
        /**
         * createArray () method: read the 1000 numbers as string from the text file
         * convert them to integers then store them in an int array.
         * input: void
         * return: int 1D array size 1000
         * using throws Exception to handle the file I/O errors
         */

        int[] temp = new int[1000];
        char ch;

        /**
         * create new input file and data objects
         */
        FileInputStream myFile = new FileInputStream("riyam1.txt");
        DataInputStream myData = new DataInputStream(myFile);
        for (int i = 0; i < 1000; i++) {
            ch = myData.readChar();
            temp[i] = Integer.parseInt(String.valueOf(ch));
        }
        return temp;
    }

    public int[] analysisArray(int[] v) {
        /**
         * analysisArray () method: create a new array of size 6.
         * Go through all the numbers in the input array and store number
         * of (1,2,...,and 6) in the output array.
         * input: int 1D array size 1000
         * return: int 1D array size 6
         */

        int[] temp = new int[6];

        /**
         * correct the number (1-6) to 0-based index (0-5)
         * then count number of total (1,2,... and 6)
         */
        for (int i = 0; i < 1000; i++)
            temp[v[i] - 1]++;
        return temp;
    }
}




