import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double left=0.0;
        double right=Math.abs(x);
        double mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(Math.abs(x)==Math.abs(y*mid)){
                break;
            }
            else if(Math.abs(x)>Math.abs(y*mid))
                left=mid;
            else
                right=mid;
            }
                if((x>0 && y>0) || (x<0 && y<0))
               System.out.println(mid);
                else
                System.out.println(-1*mid);
    }
}