package src;


import java.util.Scanner;

class pizzaCut {

   static void pizza(int n) {
        // Case 1
    System.out.print((360%n ==0)?"1":"0");

        // Case 2
    System.out.print((n <=360)?"1":"0");

        // Case 3
    System.out.print((((n *(n +1))/2)<=360)?"1":"0");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        pizzaCut p=new pizzaCut();
        p.pizza(x);
    }
}
