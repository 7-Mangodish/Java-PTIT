/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02016_Bo3SoPyTaGo {
    public static boolean search(long a[], int l, int r, long x){
        while(l<=r){
            int m = (l+r)/2;
            long tmp = a[m]*a[m];
            if(x==tmp)
                return true;
            else if(x<tmp)
                r = m -1;
            else
                l = m+1;
        }
        return false;
    }
    public static void test(Scanner sc){
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i =0; i<n ;i++)
            a[i] = sc.nextLong();
        Arrays.sort(a);

        for(int i=0; i<n-2; i++){
            for(int j =i+1; j<n-1; j++){
                long     tmp = a[i]*a[i] + a[j]*a[j];
                if(search(a, j+1, n-1, tmp)){
                    System.out.println("YES");
                    return;
                }                  
            }
        }
        System.out.println("NO");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            test(sc);
        }
    }
}
/*
2
5
3 1 4 6 5
3
1 1 1
*/