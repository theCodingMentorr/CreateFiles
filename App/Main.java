import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String files = scan.nextLine();
        File file = new File(files);
        boolean isFile = file.createNewFile();
        if (isFile) {
            System.out.println(files + " File Created");
        } else {
            System.out.println("Sorry File Couldn't " +
                    "Be Created");
        }
    }
}