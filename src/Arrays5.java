public class Arrays5 {
    public static void main(String[] args) {
        int[] arraytest = new int[10];
        for (int k = 0; k <= 9; k++){
            int randomTal = (int) (Math.random()*6); //laver et random tal
            arraytest[k]=randomTal; // giver værdien ind på
            System.out.println("Array "+k+" har fået værdien: "+ randomTal); //printer it
        }
        arraytest[5] = 80;
        System.out.println("Array 5 har fået ny værdi : "+ arraytest[5]);

    }
}
