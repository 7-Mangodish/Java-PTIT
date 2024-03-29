/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

class SV{
    private String id, name, cl, emai;

    public SV(String id, String name, String cl, String emai) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.emai = emai;
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

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }
    
    @Override 
        public String toString(){
        return this.id + " " + name + " " + cl +" " + emai;
    }
}
public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> ar = new ArrayList<SV>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            ar.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String id = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", id);
            for(SV x:ar){
                if(x.getCl().compareTo(id)==0)
                    System.out.println(x);
            }
        }
    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
D15CQKT02-B
*/