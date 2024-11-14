package Numbers;

import java.util.ArrayList;

public class One{
    public int number;
    public int symbol;

    public One() {
    }

    public void addToTable(ArrayList<One> list) {
        switch (symbol){
            case -1:
                list.add(new One(0));
                return;
            case 0:
                list.add(new One(1));
                list.add(new One(-1));
                return;
            case 1:
                list.add(new Two(0));
                return;
            default:

        }
    }

    public One(int number, int symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public One(int symbol) {
        this.number = 1;
        this.symbol = symbol;
    }

    One setNumber(int number){
        this.number = number;
        return this;
    }

    One setSymbol(int symbol){
        this.symbol = symbol;
        return this;
    }

    @Override
    public String toString() {
        return "One{" +
                "number=" + number +
                ", symbol=" + symbol +
                '}';
    }

    public void print(){
        StringBuilder string = new StringBuilder();
        string.append(this.number);
        if(this.symbol!=0) string.append(this.symbol==1?"+":"-");
        string.append(";");
        System.out.print(string);
    }

    public int valueNumber(){
        return this.number;
    }
}
