import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileSearch a=new FileSearch("you" );
        a.parseFile("C:\\Users\\CW\\Desktop\\Text.txt");
        System.out.println(a);



    }
}
