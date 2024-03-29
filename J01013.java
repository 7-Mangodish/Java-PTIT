/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Scanner;

public class J01013 {
    static int Nmax=2000001+2;
    static int[] sum= new int[Nmax];
    static int[] ar =new int[Nmax];
    static void Seive(){
        ar[0]=ar[1]=1;
        for(int i =2; i<=Math.sqrt(Nmax); i++){
            if(ar[i]==0){
                for(int j=i*i; j<Nmax; j+=i){
                    ar[j]=1;
                }
            }
        }
        for(int i=2; i<Nmax; i++){
            if(ar[i]==0){ // Neu i la so nguyen to
                for(int j=i; j<Nmax; j+=i){// Cap nhat cac so la boi cua i
                    int tmp=j;
                    while(tmp %i==0 && tmp >0){
                        sum[j]+=i;
                        tmp/=i;
                    }
                }
            }
                
        }

    }
   
    public static void main(String arg[]){
        Seive();
//        for(int i=1; i<=10; i++){
//            System.out.println(sum[i]);
//        }
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long ans=0;
        while(t-- >0){
            int n=sc.nextInt();
            ans+=sum[n];
        }
        System.out.println(ans);
    }
}
/*
5 
7
9 
10 
13 
100
*/