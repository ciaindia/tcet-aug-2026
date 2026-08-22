class Main {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("Floor No. " + i);
            if(i == 13){break;}

        }
    }
    
}
