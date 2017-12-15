public class Variabler1 {
    //InstansVarialbe
    int alder = 1;
    
    //lokalvariable:
    void printSecretNumber(){
        private int k = 123;//<--
        System.out.println(k); 
    }
    
    public static void main(String[] args) {
        //Vis et eksempel på typecasting fra double til int.
        int randomTal = (int) (Math.random()*6); //laver et random tal
        System.out.println(randomTal);
    }
       

    

    /*BRUGES TIL KLASSEROGOBJEKTER2 !!!*/
    Variabler1(String skrivNoget){
        //skrivNoget kunne f.eks. så printes her, eller ligges i arraylist.
    }
    public int testMetode2plus2(){
        return 2+2;
    }
    int k = 5;

}
