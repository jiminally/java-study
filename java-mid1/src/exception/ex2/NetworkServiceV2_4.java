package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        //정상 흐름, 예외 흐름 명확하게 분리
        try {
            client.connect();
            client.send(data); //throw new RuntimeException("ex"); 안잡기때문에 호출한 쪽으로 던진다
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드]: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect();
    }
}
