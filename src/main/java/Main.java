import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileSearch a=new FileSearch();
        a.parseFile("C:\\Users\\CW\\Desktop\\Notite\\shiftare.txt","shift");
        System.out.println(a);



    }
}
