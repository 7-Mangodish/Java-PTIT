/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Arrays;
import java.util.Scanner;


class time implements Comparable <time>{
    public int h, m, s;
    
    public time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
    public int getTime(){
        return this.h * 60 * 60 + this.m * 60 + this.s;        
    }
    @Override
    public int compareTo(time other){
        return this.getTime() - other.getTime();
    }
    
    @Override
    public String toString(){
        return String.format("%d %d %d",this.h, this.m, this.s);
    }
}
public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        time t[] = new time[n];
        for (int i=0; i<n; i++){
            t[i] = new time(sc.nextInt(), sc.nextInt(), sc.nextInt());            
        }
        Arrays.sort(t);
        for(time x: t){
            System.out.println(x);
        }
            
    }
}
/*
3
11 20 20
14 20 14
11 15 12
*/