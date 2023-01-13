package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "100.10";

//        Integer contohInt = Integer.parseInt(contoh);
        Double contohDouble = Double.parseDouble(contoh);

//        System.out.println(contohInt);
        System.out.println(contohDouble);
    }
}
