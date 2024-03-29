/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SV{
    private String id, name, cl, em;

    public SV(String id, String name, String cl, String em) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.em = em;
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

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.cl + " " +this.em;
    }
}
public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<SV> ar = new ArrayList<SV>();
        while(sc.hasNextLine()){
            String id = sc.nextLine();
            if(id.isEmpty())
                break;
            ar.add(new SV(id, sc.nextLine(), sc.nextLine(), sc.nextLine()));

        }
        Collections.sort(ar, new Comparator<SV>(){
            @Override
            public int compare(SV o1, SV o2) {
                return o1.getId().compareTo(o2.getId());
            }            
        });
        for(SV x: ar){
            System.out.println(x);
        }
    }    
}
/*
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
*/