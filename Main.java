package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        String s, ch, ch1;
        int count = 0;
        int n = 0;
        System.out.println("Enter the String: ");
        Scanner c = new Scanner(System.in);
        s = c.nextLine();
        System.out.println("Enter the character: ");
        Scanner c2 = new Scanner(System.in);
        ch = c2.next();
        System.out.println("Enter the number of occurence: ");
        Scanner c3 = new Scanner(System.in);
        n = c3.nextInt();
        String result = ch + String.join("", Collections.nCopies(n-1, ch));
        System.out.println(result);
        Pattern pattern = Pattern.compile(result);
        Matcher m = pattern.matcher(s);
        boolean seqFound = s.contains(result);
        System.out.println(seqFound);
    }
}


