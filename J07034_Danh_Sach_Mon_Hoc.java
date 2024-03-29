
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class mh implements Comparable<mh>{
    public String id, name, cnt;
    public mh(String id, String name, String cnt){
        this.id = id;
        this.name = name;
        this.cnt = cnt;
    }
    
    @Override
    public int compareTo( mh o){
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.id + " " + this.name +" "+ this.cnt;
    }
}
public class J07034_Danh_Sach_Mon_Hoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\MONHOC.txt"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<mh> a = new ArrayList<mh>();
        for(int i=0; i<n; i++){
            a.add(new mh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            
        }
        Collections.sort(a);
        for(mh x:a){
            System.out.println(x);
        }
    }
}
