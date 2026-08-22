class Hi {
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
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
        t1.run();
    }
}
