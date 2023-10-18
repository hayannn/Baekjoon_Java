package org.example;

import java.util.Scanner;
public class BJ9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String[] array = new String[A];

        for(int i=0; i<array.length; i++){
            array[i] = sc.next();
        }
        sc.close();

        for(int i=0; i<array.length; i++){
            //1자리
            if(array[i].length() < 1){
                System.out.println(array[i] + "" + array[i]);
            }
            //2자리 이상
            else {
                System.out.print(array[i].substring(0, 1));
            }
            //끝에서 -1번째부터 끝까지
            System.out.println((array[i].substring(array[i].length() - 1, array[i].length())));
        }




    }
}
