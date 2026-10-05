package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    // 음악 켜기
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    // 음악 끄기
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 볼륨 올리기
    void volumeUp() {
        this.volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 볼륨 내리기
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    // 상태 확인
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

    }

}


