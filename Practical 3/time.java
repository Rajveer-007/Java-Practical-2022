public class time {
    int sec;
    int min;
    int hour;

    time(int hour,int min,int sec){
        this.hour = hour;
        this.min= min;
        this.sec= sec;
        System.out.println(hour + ":" + min + ":" + sec);
    }

    public static void sumTime(time t1 ,time t2){
        int sumHour = t1.hour + t2.hour;
        int sumMin= t1.min + t2.min;
        int sumSec = t1.sec + t2.sec;

        System.out.println("Sum of two Time Object is " + sumHour + ":" + sumMin + ":" + ":" + sumSec);
    }
    public static void main(String[] args) {
       // Here insted of direct passing the value of Hour,min and second you also can take input from user
        time t1 = new time(10,30,12);
        time t2 = new time(5,15,12);
        sumTime(t1,t2);
        
        /* 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Time T1 members values");
        int ht1 = in.nextInt();
        int mt1 = in.nextInt();
        int st1 = in.nextInt();

        System.out.println("Enter Time T2 members values");
        
        int ht2 = in.nextInt();
        int mt2 = in.nextInt();
        int st2 = in.nextInt();
     
        
        time t1 = new time(ht1,mt1,st1);
        time t2 = new time(ht2,mt2,st2);

        System.out.println("Time Object T1 is " + ht1 + ":" + mt1 +  ":" + st1);
        System.out.println("Time Object T2 is " + ht2 + ":" + mt2 +  ":" + st2);
        sumTime(t1,t2);
        
        */
    }

}
