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

class SVien{
    private String id,name, cl, date;
    private float p;

    public SVien(String id, String name, String cl, String date, float p) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.date = date;
        this.p = p;
    }

    public float getP() {
        return p;
    }
            
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.cl +" " + this.date + " " +String.format("%.2f", p);
    }
}
public class J05005_DanhSachDoiTuongSInhVien3 {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<SVien> ar = new ArrayList<>();
        for(int i =0; i<t; i++){
            String name = sc.nextLine().trim();
            String w[] = name.split(" +");
            String ans ="";
            for (String x:w){
                ans += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
            ans = ans.trim();
            
            String cl = sc.nextLine();
            String time = sc.nextLine();
            Date date = sdf.parse(time);
            float p = Float.parseFloat(sc.nextLine());
            
            ar.add(new SVien(String.format("B20DCCN%03d", i+1), ans, cl,sdf.format(date), p ));
        }
        Collections.sort(ar, new Comparator<SVien>(){
            @Override
            public int compare(SVien o1, SVien o2) {
               if(o1.getP() > o2.getP())
                   return -1;
               return 1;
            }
        
        });
        for(SVien x: ar){
            System.out.println(x);
        }
    }
}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/