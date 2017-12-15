import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        //laver array list
        ArrayList<Integer> obj = new ArrayList<>();

        //tilføjer
        obj.add(2); //plads 0 = 2
        obj.add(54);//plads 1 = 54
        obj.add(2,5); //plads 2 = 5
        System.out.println(obj);
        System.out.println(obj.get(1));//printer plads 1

        //remover INDEX number
        obj.remove(0);
        System.out.println(obj);

        //Fjerner alt i arraylist
        obj.clear();
        System.out.println(obj);

    }
}
