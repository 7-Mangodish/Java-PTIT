/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J07008_DayConTangDan {
    static int a[] = new int[25],
               x[] = new int[25],
               n;    
    static TreeSet<String> ans = new TreeSet<String>();
    
    static boolean check(){
        int min =-1;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(x[i] ==1 ){
                cnt++;
                if(a[i] < min)
                    return false;
                else
                    min = a[i];
            }
        }
        if(min == -1 || cnt==1)
            return false;
        return true;
    }
    static void Try(int k){
        for(int i=0; i<=1; i++){
            x[k] = i;
            if(k<n)
                Try(k+1);
            else{
                if(check()){
                    String tmp="";
                    for(int j=0; j<n; j++){
                        if(x[j] == 1)
                            tmp += String.valueOf(a[j]) + " ";
                    }
                    if(ans.contains(tmp) == false)
                        ans.add(tmp);
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int ind=0;
        while(sc.hasNextInt()){
            if(ind ==0)
                n= sc.nextInt();
            else{
               a[ind-1] = sc.nextInt();
            }
            ind++;
        }
        Try(0);
        for(String x: ans)
            System.out.println(x);
       
    }
}
/*
4
6 3 7 11
*/