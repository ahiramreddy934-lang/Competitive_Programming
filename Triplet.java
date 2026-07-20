import java.util.*;
public class Triplet{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[n];
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
            if(a[i]>max1){
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if (a[i]>max2){
                max3=max2;
                max2=a[i];
            }
            else if (a[i]>max3){
                max3=a[i];
            }
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2)
               min2=a[i];
        }
    int product1=max1*max2*max3;
    int product2=min1*min2*max1;
    if(product1>=product2)
        System.out.println(max1+" "+max2+" "+max3+" ");
    else
       System.out.println(max1+" "+min2+" "+min1+" ");
       obj.close();
    }
}