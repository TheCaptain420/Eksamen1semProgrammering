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

        //While
        int k= 1;
        while (k<=5){
            System.out.println("Tæller : "+k);
            k++;
        }

        //do While (Kører en gang før, den checker)
        int i= 6;
        do{
            System.out.println("Tæller : "+i);
            i++;
        }while(i<=10);

        //for løkke
        for(int j= 11; j<=15;j++ ){
            System.out.println("Tæller : "+j);
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
