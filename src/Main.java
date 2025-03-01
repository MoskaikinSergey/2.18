import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Привет, " + name + "!");
        in.close();
    }
}
