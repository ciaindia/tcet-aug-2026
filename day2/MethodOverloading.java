class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(1, 2, 5));
    }   
}