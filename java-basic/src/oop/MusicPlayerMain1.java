package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("시작");

        volume++;
        System.out.println("볼륨 업");
        volume++;
        System.out.println("볼륨 업");

        volume--;
        System.out.println("볼륨 다운");

        if (isOn) {
            System.out.println(volume);
        } else {
            System.out.println("off");
        }
        isOn= false;
    }
}
