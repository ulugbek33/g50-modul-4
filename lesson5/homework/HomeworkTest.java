package lesson5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class HomeworkTest {
    public static void main(String[] args) {

        ForkJoinPool pool=new ForkJoinPool();
        Task1 task=new Task1(1000,1,40000);
        List<Integer> list=pool.invoke(task);
        System.out.println("1 dan 40000 gacha bolgan tub sonlar="+list);

        ForkJoinPool forkJoinPool=new ForkJoinPool();
        Task2 task2=new Task2(1000,1,40000);
        List<Integer> list2=forkJoinPool.invoke(task2);
        System.out.println("5 ga qoldiqsiz bo'linadigan sonlar="+list2);

        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println("Birinchi instance="+singleton1);
        System.out.println("Ikkinchi instanse="+singleton1);
        System.out.println("Ikkalasi tengmi="+(singleton1==singleton2));
    }
}
