package lang.string.test;

public class TestString10 {
    static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] parts = fruits.split(",");

        for (String part : parts) {
            System.out.println(part);
        }

        String joinedString = String.join("->", parts);
        System.out.println("joinedString = " + joinedString);
    }
}
