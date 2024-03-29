/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class SV{
    private String id, name, cl, date;
    private float p;

    public SV(String id, String name, String cl, String date, float p) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.date = date;
        this.p = p;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.cl + " " + date + " " + String.format("%.2f", p);
    }
}    
    
public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <SV> a = new ArrayList<>();
        for(int i=1; i<=t; i++){
            String id =String.format("B20DCCN%03d", i),
            name = sc.nextLine(),
            cl = sc.nextLine(),
            d = sc.nextLine();
            float p = Float.parseFloat(sc.nextLine());
            
            String date = sdf.format(sdf.parse(d));
            
            a.add(new SV(id, name, cl, date, p));
        }
        
        for(SV x : a){
            System.out.println(x);
        }
    }
}
/*
2
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
Nguyen Van An
D20CQCN01-B
2/12/2002
3.1
*/