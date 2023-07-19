package methods.factorymethods;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance();//returns an object to the class to which it belongs
        System.out.println(nf);
    }
}
