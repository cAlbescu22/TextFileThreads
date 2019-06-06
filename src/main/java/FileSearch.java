import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch  {
    int nrOfApparitions=0;



    public int parseFile (String fileName, String searchWord) throws FileNotFoundException {

        Scanner input=new Scanner(new File(fileName));
        while (input.hasNext()){
            String line=input.nextLine().toString();
            if (line.contains(searchWord)){
               nrOfApparitions++;
            }
        }
        return nrOfApparitions;

    }

    public FileSearch() {
        this.nrOfApparitions = nrOfApparitions;
    }

    @Override
    public String toString() {
        return "nrOfApparitions=" + nrOfApparitions ;
    }
}

