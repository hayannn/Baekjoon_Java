package org.example;

import java.util.Scanner;
public class BJ9086V2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();


        for(int i=0; i<A; i++){
            String input1 = sc.next();
            String P = String.valueOf(input1.charAt(0));
            String Q = String.valueOf(input1.charAt(input1.length()-1));
            System.out.printf("\n%s", P);
            System.out.printf("%s", Q);
        }
        sc.close();

    }
}
