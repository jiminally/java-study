package loop;

public class Continue1 {

    static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; //출력 안되고 바로 와일문으로 올라감
            }
            System.out.println(i);
            i++;
        }
    }
}
