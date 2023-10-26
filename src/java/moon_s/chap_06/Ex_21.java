package src.java.moon_s.chap_06;

public class Ex_21 {

    // TODO 메소드 작성하는 연습, 변수 작성 연습

    // MyTv 클래스 선언
    static class MyTv { // static 붙여줘야 메인메소드에서 사용가능

        // 각각 변수 선언
        boolean isPowerOn;
        int channel;
        int volume;

        final int MAX_VOLUME = 100;
        final int MIN_VOLUME = 0;
        final int MAX_CHANNEL = 100;
        final int MIN_CHANNEL = 1;

        // 각 각 기능을 수행할 메소드 선언
        void turnInOff() {
            // isPowerOn 값이 true -> false
            // false - > true
            isPowerOn = !isPowerOn;
        }

        void volumeUp() {
            // 볼륨이 맥스볼륨보다 작으면 볼륨++
            if(volume < MAX_VOLUME) {
                volume++;
            }
        }

        void volumeDown() {
            // 볼륨이 민볼륨보다 크면 볼륨 --
            if (volume > MIN_VOLUME) {
                volume--;
            }
        }

        void channelUp() {
            // 채널이 맥스채널과 같으면 -> 채널을 민채널로 바꿈
            if(channel == MAX_CHANNEL) {
                channel = MIN_CHANNEL;
                // 채널이 맥스 채널과 같지 않다면 -> 채널 ++
            } else {
                channel++;
            }
        }

        void channelDown() {
            // 채널이 민채널과 같으면 -> 채널을 맥스채널로 바꿈
            if(channel == MIN_CHANNEL) {
                channel = MAX_CHANNEL;
                // 채널이 민채널과 같지 않으면 -> 채널 --
            } else {
                channel--;
            }
        }
    }

        public static void main(String[] args) {
        // 왜 새 객체를 생성하지 못하는가?
            MyTv t = new MyTv();

            t.channel = 100;
            t.volume = 0;
            System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

            t.channelDown();
            t.volumeDown();
            System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

            t.volume = 100;
            t.channelUp();
            t.volumeUp();
            System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        }
    }
