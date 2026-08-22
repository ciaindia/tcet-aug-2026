//CW1: WAP to read a number from command line and print square of that number
//Eg: java Main 5
//Square of 5 is 25

class Main { 
    public static void main(String[] args) { 
        int num = Integer.parseInt(args[0]);
        int sqr = num * num;
        System.out.println("Square of " + num + " is " + sqr);
    }
}