/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class NVien{
    private String id, name, sex, date, add, id_tax, date_con;

    public NVien(String id, String name, String sex, String date, String add, String id_tax, String date_con) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
        this.id_tax = id_tax;
        this.date_con = date_con;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " "  + this.date + " " + this.add + " " 
                + this.id_tax + " " + this.date_con; 
    }
}
public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        NVien a[] = new NVien[t];
        for (int i=0; i<t; i++){
            a[i] = new NVien(String.format("%05d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine());           
        }
        for(NVien x: a){
            System.out.println(x);
        }
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
*/