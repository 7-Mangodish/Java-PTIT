/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

class J05032 implements Comparable<J05032>{
    private String name;
    private long time;

    public J05032(String name, long time) {
        this.name = name;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(J05032 o){
        return -Long.compare(this.time, o.getTime() );
    }

}
public class J05032_TreNhatGiaNhat {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <J05032> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String name = sc.next();
            String s = sc.next();
            Date d = sdf.parse(s);
            long time = d.getTime()/1000;
            ar.add(new J05032(name, time));
        }
        Collections.sort(ar);
        System.out.println(ar.get(0).getName());
        System.out.println(ar.get(t-1).getName());
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/