package Numbers;

import java.util.ArrayList;

public class Two extends One{

    public Two(int symbol) {
        this.setNumber(2);
        this.setSymbol(symbol);
    }

    @Override
    public void addToTable(ArrayList<One> list) {
        list.add(new One(0));
        list.add(new Two(0));
    }

    @Override
    public int valueNumber(){
        return this.number;
    }

    @Override
    public void print() {
        StringBuilder string = new StringBuilder();
        string.append(this.number);
        string.append(";");
        System.out.print(string);
    }
}
