package chap06.exam03;

public class ConstructerExam6 {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.displayVolume();
    }
}

class Tv{
    String brand;
    int inch;
    private int maxChannel;
    private int maxVolume;
    int currentChannel;
    int currentVolume;

    Tv(){
        this("LG", 28, 100, 15);
    }


    Tv(String brand, int inch, int maxChannel, int maxVolume){
        this.brand = brand;
        this.inch = inch;
        this.maxChannel = maxChannel;
        this.maxVolume = maxVolume;
    }

    void volumeUp(){
        if(currentVolume<maxVolume){
            System.out.println("볼륨 업!");
            currentVolume++;
        }else{
            System.out.println("최대 볼륨입니다!!");
        }
    }

    void displayVolume(){
        System.out.println(currentVolume);
    }
}