package org.example;
import java.util.Random;

public class Evo extends Thread{
    int avgspeed;
    Random rand = new Random();
    public void run (int km) throws  InterruptedException{
        int p = 0;
        int t = 0, time;
        float speed = 1, r;
        for(int distance = km*100; distance>0; distance-=r){
            speed+=rand.nextInt(10);
            while (speed>110){
                speed-=1;
            }
            p += speed;
            t++;
            avgspeed = p / t;

            r = (float) (speed * 0.28);
            time = (int) (distance / (speed * 0.28));

            System.out.println("Скорость: " + speed + " km/h");
            System.out.println("Средняя скорость: " + avgspeed + " km/h");
            System.out.println("До конца маршрута: " + distance / 1000 + " km");
            System.out.println("Время прибытия: " + time + " sec");
            System.out.println();
            if (time ==0){
                System.out.println("Вы приехали!");
            }
            Thread.sleep(1000);
        }
    }
}
