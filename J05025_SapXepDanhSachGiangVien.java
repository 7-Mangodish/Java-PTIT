/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class GV{
    private String id, name, major;

    public GV(String id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        String w[] = this.name.split(" +");
        return w[w.length-1];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.major;
    }
}
public class J05025_SapXepDanhSachGiangVien {
    public static String getMajors(String s){
        String w[] = s.split(" +");
        String ans ="";
        for(String x:w)
            ans += x.substring(0,1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <GV> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        
        for(int i=0; i<t; i++){
            String id = String.format("GV%02d", i+1);
            String name = sc.nextLine();
            String s = sc.nextLine().toUpperCase();
            String major = getMajors(s);
            ar.add(new GV(id, name, major));
        }
        
        Collections.sort(ar, new Comparator<GV>(){
            @Override
            public int compare(GV o1, GV o2) {
                if(o1.getName().compareTo(o2.getName()) == 0)
                    return o1.getId().compareTo(o2.getId());
                return o1.getName().compareTo(o2.getName());
            }
        
        });
        
        for(GV x:ar){
            System.out.println(x);
        }
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/