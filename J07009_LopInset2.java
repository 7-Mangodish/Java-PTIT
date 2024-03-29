/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class IntSet{
    private Set<Integer> ar ;

    public IntSet(int a[]) {
        ar = new TreeSet<>();
        for(int x:a)
            ar.add(x);
    }
    public IntSet(Set<Integer> s) {
        ar = new TreeSet<>();
        ar.addAll(s);
    }
    public Set<Integer> getAr() {
        return ar;
    }
    
    public IntSet intersection(IntSet o){
        Set<Integer> st = new TreeSet<>();
        for(int x:o.getAr()){
            if(this.ar.contains(x))
                st.add(x);
        }
        return new IntSet(st);
    }
    
    @Override
    public String toString(){
        for(int x: ar){
            System.out.print(x+" ");
        }
        return "";
    }
}
public class J07009_LopInset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
