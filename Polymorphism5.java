class TimeFormat {
    int hour;
    int minutes;
    int seconds;

    TimeFormat() {
        hour = minutes = seconds = 0;
    }

    TimeFormat(int h) {
        hour = h;
        minutes = seconds = 0;
    }

    TimeFormat(int h, int m) {
        hour = h;
        minutes = m;
        seconds = 0;
    }

    TimeFormat(int h, int m, int s) {
        hour = h;
        minutes = m;
        seconds = s;
    }

    void display() {

        System.out.println("hour is : " + hour);
        System.out.println("minutes is : " + minutes);
        System.out.println("seconds is : " + seconds);
        System.out.println("Time in HH:MM:SS is " + hour + ":" + minutes + ":" + seconds + "");
        System.out.println("---------------------------");
    }

}

public class Polymorphism5 {
    public static void main(String[] args) {
        TimeFormat time = new TimeFormat();
        TimeFormat time1 = new TimeFormat(32);
        TimeFormat time2 = new TimeFormat(32, 23);
        TimeFormat time3 = new TimeFormat(32, 23, 45);
        time.display();
        time1.display();
        time2.display();
        time3.display();

    }
}
