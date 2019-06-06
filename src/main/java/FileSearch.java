import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch  {
    private int nrOfApparitions=0;
    private String wordSearch;


    public int parseFile(String fileName) throws FileNotFoundException {

        Scanner input=new Scanner(new File(fileName));
       while(input.hasNext()){
            String line=input.nextLine().toLowerCase();
            String [] wordsOnLine=line.split("\\W");
           for (String word:wordsOnLine) {
               if (word.toLowerCase().matches(wordSearch)) {
                   nrOfApparitions++;
               }

           }


            }
        return nrOfApparitions;
        }

    public FileSearch(String wordSearch) {
        this.wordSearch=wordSearch;

    }

    @Override
    public  String toString() {
        return "nrOfApparitions=" + nrOfApparitions ;
    }

}

