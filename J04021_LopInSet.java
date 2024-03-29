/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


class IntSet{
    private TreeSet<Integer> ar = new TreeSet<>();

    public IntSet() {
    }
    public IntSet(int[] a) {
        for(int x:a)
            this.ar.add(x);
    }

    public TreeSet<Integer> getA() {
        return this.ar;
    }
    
    public IntSet union(IntSet a){
        IntSet ans = new IntSet();
        for(int x:this.ar)
            ans.getA().add(x);
        for(int x:a.getA())
            ans.getA().add(x);
        return ans;
    }
    
    @Override
    public String toString(){
        String ans="";
        for(int x:ar){
            ans += String.valueOf(x) +" ";
        }
        return ans;
    }
}
public class J04021_LopInSet {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<m; i++) b[i] = sc.nextInt();
            IntSet s1 = new IntSet(a);
            IntSet s2 = new IntSet(b);
            IntSet s3 = s1.union(s2);
            System.out.println(s3);
        }
}
