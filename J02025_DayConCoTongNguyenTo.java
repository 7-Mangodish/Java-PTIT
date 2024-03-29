/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J02025_DayConCoTongNguyenTo {
    public static int a[], n, sum =0;
    public static ArrayList<Integer> ar = new ArrayList<>();
    public static Set<String> ans = new TreeSet<String>();
    
    public static void init(){
        String tmp="";
        Collections.sort(ar, Comparator.reverseOrder());
        for(int x:ar)
            tmp += String.valueOf(x) + " ";
        tmp = tmp.trim();
        ans.add(tmp);
    }
    public static boolean isPrime(int a){
        if(a<2)
            return false;
        for(int i=2; i<=(int)Math.sqrt(a); i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void Try(int k){
        for(int i=k+1; i<=n; i++){
            ar.add(a[i]);
            sum+=a[i];
            if(isPrime(sum))
                init();
            if(k < n)
                Try(i);
            ar.remove(ar.size()-1);
            sum-=a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-->0){
            
            ans.clear();
            ar.clear();
            n = sc.nextInt();
            a = new int[n+1];
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
            Try(0);
            for(String x:ans)
                System.out.println(x);
        }
            
    }
}
/*
1
4
3 2 5 4
*/

