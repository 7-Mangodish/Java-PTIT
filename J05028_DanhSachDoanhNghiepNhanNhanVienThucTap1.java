/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DN{
    private String id, name ;
    private int cnt;

    public DN(String id, String name, int cnt) {
        this.id = id;
        this.name = name;
        this.cnt = cnt;
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

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.cnt;
    }
    
}
public class J05028_DanhSachDoanhNghiepNhanNhanVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DN> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            ar.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        
        Collections.sort(ar, new Comparator<DN>(){
            @Override
            public int compare(DN o1, DN o2) {
                if(Integer.compare(o1.getCnt(), o2.getCnt()) ==0){
                    return o1.getId().compareTo(o2.getId());
                }
                return -Integer.compare(o1.getCnt(), o2.getCnt());                
            }
        });
        
        for(DN x:ar){
            System.out.println(x);
        }
    }
}

/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
*/