package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Kahfi");
        builder.append(" ");
        builder.append("Kurnia");
        builder.append(" ");
        builder.append("Aji");

        String name = builder.toString();
        System.out.println(name);

    }
}
