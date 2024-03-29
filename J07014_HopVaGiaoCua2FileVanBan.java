/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import        java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet{
    private Set<String> st;
    private Scanner sc ;
    public WordSet(String s) throws FileNotFoundException{
        st = new TreeSet<>();
        sc = new Scanner(new File(s));
        while(sc.hasNext()){
            st.add(sc.next().toLowerCase());
        }
    }

    public WordSet(Set<String> st) {
        this.st = st;
    }

    public Set<String> getSt() {
        return st;
    }
    
    public WordSet union(WordSet o){
        Set<String> s = new TreeSet<String>();
        for(String x:o.getSt()){
            s.add(x);
        }
        for(String x:st){
            s.add(x);
        }    
        return new WordSet(s);
    }
    
    public WordSet intersection(WordSet o){
        Set<String> s = new TreeSet<String>();
        for(String x:o.getSt()){
            if(this.st.contains(x))
                s.add(x);
        }        
        return new WordSet(s);
    }
    
    @Override
    public String toString(){
        for(String x: st){
            System.out.print(x+" ");
        }
        return "";
    }
}

public class J07014_HopVaGiaoCua2FileVanBan {
public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
