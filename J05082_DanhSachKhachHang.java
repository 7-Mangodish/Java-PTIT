/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
class Cus{
    private String id, name, add, sex, time;
    private Date date;

    public Cus(String id, String name, String sex, Date date, String add, String time) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
        this.time = time;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " " + this.add +" "+ this.time ; 
    }
}
public class J05082_DanhSachKhachHang {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Cus> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = String.format("KH%03d", i+1),
                   w[] = sc.nextLine().trim().split(" +"),
                   sex = sc.nextLine(),
                   s = sc.nextLine(),
                   add = sc.nextLine();
            String name = "";
            for(String x: w)
                name += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            name = name.trim();
            Date d = sdf.parse(s);
            String time = sdf.format(d);
            ar.add(new Cus(id,name, sex, d, add, time));
        }
        Collections.sort(ar, new Comparator<Cus>(){
            @Override
            public int compare(Cus o1, Cus o2){
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        for(Cus x: ar)
            System.out.println(x);
    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/11/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/