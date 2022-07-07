
/**
 * Reads a CSV file
 *
 * @author Rowan McDougall
 * @version 1 (31/05/2022)
 */

import java.util.Scanner; // Required in order to read files.
import java.io.IOException; // Handle errors
import java.io.File; // File handles

public class readCSV
{
    final String FILENAME="arrivals.csv"; // The name of the CSV being read.
    final int MAXLINES=100; // The program will only read this number of lines.
    final int VALUESPERLINE=4; // The number of values present on each line.
    /**
     * Constructor for objects of class readCSV
     */
    public readCSV()
    {
        File thefile = new File(FILENAME); // Generates the file handle.
        String CSVlines[] = new String[MAXLINES];
        String AllLinesAllValues[][] = new String[MAXLINES][VALUESPERLINE]; // Array that stores all the lines read.
        int lineCount=0; // Keeps track of the lines read / remembers the number of lines read.
        try {
            Scanner reader = new Scanner(thefile); // Opens the file using the Scanner.
            // Reads the contents of the file, stops at the end or if too many lines are read.
            while (reader.hasNextLine() && lineCount < MAXLINES){
                String line=reader.nextLine();
                CSVlines[lineCount]=line;
                lineCount++;     
            }
            for (int i=0;i<lineCount;i++){
                String values[] = CSVlines[i].split(",");      
                for (int j=0;j<values.length;j++)
                    AllLinesAllValues[i][j]=values[j];
            }
        } catch (IOException e) {System.out.println(e);}
        for (int i=0;i<lineCount;i++)
            System.out.println("at "+AllLinesAllValues[i][0]+" "+AllLinesAllValues[i][1]+" arrived.");
            
    }
}
