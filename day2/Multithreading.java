class Hi extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    } 
}

class Huku extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Huku");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
}

class Main {
    public static void main(String[] args) {
        Hi t1 = new Hi();
        t1.start();

        Huku t2 = new Huku();
        t2.start();
    }
}
