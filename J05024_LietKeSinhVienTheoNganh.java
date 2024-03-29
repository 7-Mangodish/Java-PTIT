/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;

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
public class J05024_LietKeSinhVienTheoNganh {
    public static String getMajors(String s){
        String w[] = s.split(" +");
        String ans = w[0].substring(0,1) + w[1].substring(0,1);
        return "DC" + ans;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<SV> ar = new ArrayList<SV>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            ar.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine().toUpperCase();
            String majors = getMajors(s);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", s);
            for(SV x:ar){
                if(x.getId().contains(majors)){
                    if(majors.compareTo("DCCN") ==0 || majors.compareTo("DCAT") ==0 ){
                        if(!x.getCl().startsWith("E"))
                            System.out.println(x);                            
                    }
                    else
                         System.out.println(x);
                }

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
E15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
2
Ke toan
Cong Nghe Thong Tin
*/