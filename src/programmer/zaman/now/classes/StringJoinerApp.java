package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(". ", "[", "]");

        joiner.add("Kahfi");
        joiner.add("Kurnia");
        joiner.add("Aji");

        String value = joiner.toString();
        System.out.println(value);

    }
}
