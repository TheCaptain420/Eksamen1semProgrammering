public class Kontrolstrukturer4 {
    public static void main(String[] args) {
        //if else
        int number = 2;
        if (number > 5){
            System.out.println("your number is bigger than 5");
        }else if(number==5 ){
            System.out.println("your number is 5");
        }else{
            System.out.println("you number is smaller than 5");
        }



        //switch
        String dag = "mandag";
        switch (dag){
            case "mandag":
                System.out.println("i dag er det mandag");
                break;//Hopper ud
            case "onsdag":
                System.out.println("Det er onsdag mine gutter");
                break;
            default:
                System.out.println("det er ikke mandag eller onsdag, feelsgood");
        }

    }
}