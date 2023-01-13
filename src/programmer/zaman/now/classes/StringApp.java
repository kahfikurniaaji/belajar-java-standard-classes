package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Kahfi Kurnia Aji";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Kahfi"));
        System.out.println(name.endsWith("Aji"));

        String[] names = name.split(" ");
        for (var valus : names) {
            System.out.println(valus);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

    }
}
