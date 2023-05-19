import java.util.*;
class time{
    public static void main(String [] args){
        Scanner ss=new Scanner(System.in);
        long totalmili=System.currentTimeMillis();
        long totalsec=totalmili/1000;
        long currentsec=totalsec%60;
        long totalmin=totalsec/60;
        long currentmin=totalmin%60;
        long totalhours=totalmin/60;
        long currenthour=totalhours%24;
        System.out.println(currenthour + " : " + currentmin +" : " + currentsec);

    }
}
