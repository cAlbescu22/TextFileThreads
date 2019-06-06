import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch  {
    int nrOfApparitions=0;
    String wordSearch;

    public int parseFile (String fileName) throws FileNotFoundException {

        Scanner input=new Scanner(new File(fileName));
       while(input.hasNext()){
            String line=input.nextLine().toLowerCase();
            countWordsOnLine(line);
            }
        return nrOfApparitions;
        }




    public FileSearch(String wordSearch) {
        this.nrOfApparitions = nrOfApparitions;
        this.wordSearch=wordSearch;

    }

    @Override
    public String toString() {
        return "nrOfApparitions=" + nrOfApparitions ;
    }
    public boolean countWordsOnLine(String line) {
       if (line.contains(wordSearch)) {
           nrOfApparitions++;
          return  countWordsOnLine(line.substring(line.indexOf(wordSearch)+wordSearch.length()));
       } else
       {
           return false;
       }
    }
}

