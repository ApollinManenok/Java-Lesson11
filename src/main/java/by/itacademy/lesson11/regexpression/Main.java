package by.itacademy.lesson11.regexpression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter our line: ");
        String str = scan.nextLine();
        str = new Compressor().compress(str);
        System.out.println(str);
        System.out.println(new Decompressor().decompress(str));
    }
}
