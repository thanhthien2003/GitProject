package class_and_object;

import java.util.Scanner;

public class StopWatch {
    long startTime;
    long stopTime;

    public long getStartTime(long startTime) {
        return startTime;
    }

    public long getStopTime(long stopTime) {
        return stopTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        getStartTime(startTime);
    }

    public void end() {
        this.stopTime = System.currentTimeMillis();
        getStopTime(stopTime);
    }

    public void getElapsedTime() {
        long elapsedTime = (stopTime - startTime);
        System.out.println("so milisecond giay dem dc la " + elapsedTime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 de bat dau dem ");
        int a = sc.nextInt();
        StopWatch stopWatch = new StopWatch();
        if (a == 1) {
            stopWatch.start();
        }
        System.out.println("nhap 2 de dung dem ");
        int b = sc.nextInt();
        if (b == 2) {
            stopWatch.end();
        }
        stopWatch.getElapsedTime();
    }
}
