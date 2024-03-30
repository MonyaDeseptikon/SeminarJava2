import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Seminar4 {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList= new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        Random rnd = new Random();
//        for (int i = 0; i < 1000000; i++) {
//            arrayList.add(rnd.nextInt());
//        }
//        Long endTime = System.currentTimeMillis();
//
//        System.out.println("ArrayList = "+(endTime-startTime));
//        long startTime1 = System.currentTimeMillis();
//        Random rnd1 = new Random();
//        for (int i = 0; i < 1000000; i++) {
//            linkedList.add(rnd.nextInt());
//        }
//        Long endTime1 = System.currentTimeMillis();
//        System.out.println("LinkedList = "+(endTime1-startTime1));
        ArrayList<Integer> arrayList= new ArrayList<>();
        LinkedList <Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        Random rnd = new Random();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(rnd.nextInt());
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("ArrayList = "+(endTime-startTime));
        long startTime1 = System.currentTimeMillis();
        Random rnd1 = new Random();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(rnd.nextInt());
        }
        Long endTime1 = System.currentTimeMillis();
        System.out.println("LinkedList = "+(endTime1-startTime1));
        int count = 0;
        long startTime3 = System.currentTimeMillis();
        Random rnd3 = new Random();

        while(count != 1000000){
            arrayList.add(4000, rnd.nextInt());
            count +=2;

        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("ArrayList = "+(endTime3-startTime3));
    }
}
