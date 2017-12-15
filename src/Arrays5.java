public class Arrays5 {
    public static void main(String[] args) {
        int[] arraytest = new int[10];
        //for loop til indsættelse
        for (int k = 0; k <= 9; k++){
            int randomTal = (int) (Math.random()*6); //laver et random tal (0-5)
            arraytest[k]=randomTal; // giver værdien ind på
            System.out.println("Array "+k+" har fået værdien: "+ randomTal); //printer it
        }
        //array [5] får værdien 80
        arraytest[5] = 80;
        System.out.println("Array 5 har fået ny værdi : "+ arraytest[5]);

    }
}
