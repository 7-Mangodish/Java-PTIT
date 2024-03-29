package CodePtit;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

public class J04006_KhaiBaoLopSinhVien {
    static class sv{
        public String id,name, cl, date;
        public float point;
        
        public sv(){
            id = "B20DCCN001";
            name = cl = date= "";
            point = 0;        
        }        
        public sv(String name, String cl, String date, float point){
            id = "B20DCCN001";
            this.name = name;
            this.cl = cl;
            this.date = date;
            this.point = point;
        }
        
        public void ch(){
            StringBuilder tmp = new StringBuilder(date);
            if(tmp.charAt(2) != '/')
                tmp.insert(0, "0");
            if(tmp.charAt(5) != '/')
                tmp.insert(3, "0");
            date = new String(tmp);         
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        sv a = new sv(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextFloat());
        a.ch();
        System.out.printf("%s %s %s %s %.2f", a.id, a.name, a.cl, a.date, a.point);

    }
}
/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
*/
