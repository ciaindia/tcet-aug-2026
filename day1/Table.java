//CW: WAP to read a number and print table of that number
//Eg: number = 5
//5 * 1 = 5 	5 * 10 = 50
//5 * 2 = 10 	5 * 9 = 45
// ...
//5 * 10 = 50	5 * 1 = 5

    class Main {
        public static void main(String[] args) {
            
            int num = 5;

            for(int i = 1, j = 10; i <= 10; i++, j--) {

                    System.out.println(num + " * " + i + " = " + num*i + " \t" + num + " * " + j + " = " + num*j);
            }
        }
    }