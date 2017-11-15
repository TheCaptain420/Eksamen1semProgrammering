import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        //laver array list
        ArrayList<Integer> obj = new ArrayList<>();

        //tilføjer
        obj.add(2);
        obj.add(54);
        obj.add(2,5);
        System.out.println(obj);

        //remover INDEX number
        obj.remove(0);
        System.out.println(obj);

        //
        obj.clear();
        System.out.println(obj);

    }
}
