package Activities;

interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {

        // Lambda expression without any body
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(6, 15));

        // Lambda expression with body
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(150, 300));
    }
}