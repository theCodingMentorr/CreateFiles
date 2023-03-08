import java.io.File;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String deleteFile = scan.nextLine();
        File file = new File(deleteFile);
        file.delete();
        System.out.println(deleteFile + " Was Deleted");

    }
}
