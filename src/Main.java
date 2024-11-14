import Numbers.One;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<One> list = new ArrayList<One>();

        list.add(new One(0));

        list.stream().forEach(entry -> entry.print());
        System.out.println("Suma: " + 1);

        for(int i = 0; i<10;i++){

            ArrayList<One> listOld = new ArrayList<One>(list);

            list.clear();
            listOld.stream().forEach(entry -> entry.addToTable(list));
            list.stream().forEach(entry -> entry.print());

            int sum = 0;
            for(int j=0; j<list.toArray().length;j++){
                sum+=list.get(j).valueNumber();
            }
            System.out.println("Suma: " + sum);
        }
    }
}
