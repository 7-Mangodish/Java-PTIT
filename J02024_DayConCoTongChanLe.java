/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J02024_DayConCoTongChanLe {
    public static int a[], n, sum =0;
    public static ArrayList<Integer> ar = new ArrayList<>();
    public static Set<String> ans = new TreeSet<String>();
    
    public static void init(){
        String tmp="";
        for(int x:ar)
            tmp += String.valueOf(x) + " ";
        tmp = tmp.trim();
        ans.add(tmp);
    }
    public static void Try(int k){
        for(int i=k+1; i<=n; i++){
            ar.add(a[i]);
            sum+=a[i];
            if(sum%2==1)
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
            n = sc.nextInt();
            a = new int[n+1];
            for(int i=1; i<=n; i++){
                a[i] = sc.nextInt();
            }
//            Arrays.sort(a, Collections.reverseOrder());
            for(int i=1; i<=n-1; i++){
                for(int j =i+1; j<=n; j++){
                    if(a[j] > a[i]){
                        int tmp =a[i];
                        a[i] = a[j];
                        a[j]= tmp;
                    }
                }
            }
            Try(0);
            for(String x:ans)
                System.out.println(x);
            ans.clear();
            ar.clear();
        }
            
    }
}
/*
1
4
2 3 4 5
*/