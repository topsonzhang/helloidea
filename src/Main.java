import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"线程1");
        Thread thread2 = new Thread(myRunnable,"线程2");
        Thread thread3 = new Thread(myRunnable,"线程3");

        thread1.start();
        thread2.start();
        thread3.start();*/


        //line();
        //detailline();
        //exception();
        //field();
        //back();
        //clause();

        System.out.println("Hello World!");
        System.out.println("topson");
        Date temp = new Date();
       System.out.println("n");

       String topsonzhang="Topson,zhang";
        String[] aa=topsonzhang.split(",");

    }

    public static void  line(){
        System.out.println("this is from line");
    }

    public  static void detailline(){
        System.out.println("this is from detailline");
    }

    public static void exception(){
        Object o =null;
        o.toString();
        System.out.println("this line can never be reached coz the exception");
    }

    public static void field(){
        Person p =new Person(new Date(), "duandian","10");
        p.setAge("12");
        System.out.println(p);
        System.out.println(p.getAge());
    }

    public static void back(){
        Person p =new Person(new Date(), "后悔药","18");
        if(p.getAge() <=19){
            System.out.println("又年轻了");
        }else{
            System.out.println("岁月是把杀猪刀");
        }

    }

    public static void clause(){
        for (int i = 0; i < 100; i++) {
            System.out.println("in the loop");

            if(i==50){
                System.out.println("shit happens");
            }else {
                System.out.println("all goods");
            }

        }
    }
}
