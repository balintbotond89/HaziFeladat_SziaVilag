public class Main {
    public static void main(String[] args) {
        System.out.println(greeting()+" "+subject());
    }

    private static String subject() {
        return "világ";
    }

    private static String greeting() {
        return "Szia";
    }
}