
package CodePtit;
import java.util.Scanner;
public class J01008 {
    static void sol(long n){
        if(n==1){
            System.out.println(n +"(1)");
            return;            
        }
            
        for(int i=2; i<=Math.sqrt(n); i++){
            int cnt=0;
            while(n%i==0){
                ++cnt;
                n/=i;
                
            }
            if(cnt!=0){
                System.out.print(i+"(" + cnt +")" +" ");
            }
        }
        if(n!=1)
            System.out.print(n +"(1)");
    }
        
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++){
            long n=sc.nextLong();
            System.out.print("Test " +i +": ");
            sol(n);
            System.out.println();
        }
    }
}
