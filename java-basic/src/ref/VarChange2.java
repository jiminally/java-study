package ref;

public class VarChange2 {
    static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);
        System.out.println("dataA 참조값= " + dataA.value); // 10
        System.out.println("dataA 참조값= " + dataB.value); // 10

        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA 참조값= " + dataA.value); //20
        System.out.println("dataA 참조값= " + dataB.value); //20

        dataB.value = 30;
        System.out.println("변경 dataB.value = 20");
        System.out.println("dataA 참조값= " + dataA.value); //30
        System.out.println("dataB 참조값= " + dataB.value); //30
    }
}
