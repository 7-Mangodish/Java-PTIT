/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> st = new TreeSet<>();

    public WordSet() {
    }
    
    
    public WordSet(String s){
        String w[] = s.toLowerCase().split(" +");
        for(String x : w)
            st.add(x);
    }
    
    public TreeSet<String> getSt(){
        return this.st;
    }
    
    public WordSet union(WordSet o){
        WordSet ans = new WordSet();
        for(String x: this.st)
            ans.getSt().add(x);
        for(String x: o.getSt())
            ans.getSt().add(x);
        return ans;
    }
    
    public WordSet intersection(WordSet o){
        WordSet ans = new WordSet();
        for(String x: this.st){
            if(o.getSt().contains(x))
                ans.getSt().add(x);
        }
        return ans;
    }
    
    @Override
    public String toString(){
        for(String x : this.st)
            System.out.print(x + " ");
        return "\n";
    }
}
public class J04022_WordSet {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            WordSet s1 = new WordSet(in.nextLine());
            WordSet s2 = new WordSet(in.nextLine());
            System.out.println(s1.union(s2));
            System.out.println(s1.intersection(s2));
        }
}

/*
Lap trinh huong doi tuong
Ngon ngu lap trinh C++
*/