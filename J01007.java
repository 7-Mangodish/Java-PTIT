package CodePtit;

import java.util.Scanner;
import java.lang.Math;

public class J01007 {
    public static long[] ar= new long[100];
    static  void fb(){
        ar[1]=0;
        ar[2]=1;
        for(int i=3; i<=93; i++){
            ar[i] =ar[i-1] + ar[i-2];
        }
    }
    
    private static boolean check(long n){
        for(int i=1; i<=93; i++){
            if(n==ar[i])
                return true;
        }
        return false;
    }
    
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        fb();
        while(t-- >0){
            long n= sc.nextLong();
            if(check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
