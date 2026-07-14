import java.util.*;
public class Medain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }
        while(i<n){
            arr[k++]=a[i++];
        }
        while(j<m){
            arr[k++]=b[j++];
        }
        int x=n+m;
        double medain;
        if(x%2==0){
            medain=(arr[x/2-1]+arr[x/2])/2.0;
        }
        else{
            medain=arr[x/2];
        }
        System.out.println(medain);
    }
}