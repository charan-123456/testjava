public class hello {
    public static void main(String[] args) {
        String username = System.getenv("USERNAME");

        System.out.println("Hello, " + username + "!");
    }
}