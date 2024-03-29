/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    public TreeSet <String> set = new TreeSet<String>();
    public WordSet(String s) {
        try{
            Scanner sc = new Scanner(new File(s));    
            while(sc.hasNext()){
                set.add(sc.next().toLowerCase());
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }        
    }
    
    @Override
    public String toString(){
        for (String x:set )
            System.out.println(x);
        return "";
    }
}
public class J07007_LietKeTuKhacNhau {
public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("E:\\CODE\\Java\\Project1\\src\\CodePtit\\VANBAN.txt");
        System.out.println(ws);
    }
}
