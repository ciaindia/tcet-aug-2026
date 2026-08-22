//CW: WAP to read 2 numbers from command line and print addition
//javac Add.java
//Eg: java Main 5 6
//5 + 6 = 11

class Main { 
    public static void main(String[] args) { 
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int add = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + add);
    }
}

