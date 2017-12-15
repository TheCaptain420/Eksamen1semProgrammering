public class javaKlasseBoks3 {

    //declare var
    double længde;
    double bredde;
    double højde;

    //metode
    public double volume(){
        return længde*bredde*højde;
    }

    //constructor
    javaKlasseBoks3(String typeBox){
        System.out.println("This box is a " + typeBox + ".");
    }
}
