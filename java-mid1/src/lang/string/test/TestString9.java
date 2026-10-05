package lang.string.test;

public class TestString9 {
    static void main(String[] args) {
        String email = "hello@example.com";
        String[] result = email.split("@");

        String idParts = result[0];
        String domainParts = result[1];

        System.out.println("ID: " + idParts);
        System.out.println("Domain: " + domainParts);
    }
}
