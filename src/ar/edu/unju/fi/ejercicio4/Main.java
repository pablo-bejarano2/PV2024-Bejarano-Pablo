package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, result;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero");
            num = scanner.nextInt();
        }while(num>10 || num <0);
        if(num==0) {
            result=1;
        }else {
            result = num;
        }
        while(num>1) {
            num--;
            result=result*num;
        }

        scanner.close();
        System.out.println(result);
    }

}