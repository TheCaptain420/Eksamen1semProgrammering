public class exceptions7 {
    public static void main(String[] args) {

        try {
            tester();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Methode
    public static void tester() throws InterruptedException{
        Thread.sleep(1000); //Skal have TryCatch //pauser i 1 sec
    }
}
