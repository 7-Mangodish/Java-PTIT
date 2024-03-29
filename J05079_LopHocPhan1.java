/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Sub{
    private String id, name, gr, lecture;

    public Sub(String id, String name, String gr, String lecture) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.lecture = lecture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }
    
    @Override
    public String toString(){
        return this.gr + " " + this.lecture;
    }
}
public class J05079_LopHocPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, String> mp = new HashMap<>();
        ArrayList<Sub> ar = new ArrayList<>();
        
        while(t-->0){
            String id = sc.nextLine(),
                   name = sc.nextLine(),
                   gr = sc.nextLine(),
                   lectures = sc.nextLine();
            ar.add(new Sub(id, name, gr, lectures));
            mp.put(id, name);
        }
        Collections.sort(ar, new Comparator<Sub>(){
            @Override
            public int compare(Sub o1, Sub o2) {
               return o1.getGr().compareTo(o2.getGr());
            }           
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String id = sc.nextLine();
            System.out.println(String.format("Danh sach nhom lop mon %s:",mp.get(id)));
            for (Sub x: ar){
                if(x.getId().compareTo(id) == 0)
                    System.out.println(x);
            }
        }
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
*/