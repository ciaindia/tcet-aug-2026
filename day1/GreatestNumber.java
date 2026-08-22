//CW: WAP to read 3 numbers and find greatest number

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("Enter number: ");
        int b = sc.nextInt();
        System.out.print("Enter number: ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is greatest");
        } else if(b > c){
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }

}