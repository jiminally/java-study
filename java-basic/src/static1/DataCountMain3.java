package static1;

public class DataCountMain3 {

    static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //인스턴스로 갔더니 어! 이거는 스태틱인데? 하고 스태틱 영역으로 넘어가서 카운트플러스

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
