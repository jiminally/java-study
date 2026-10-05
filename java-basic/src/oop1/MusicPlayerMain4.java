//메서드 추출
package oop1;

public class MusicPlayerMain4 {
    static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();

    }

    static void on(MusicPlayData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
