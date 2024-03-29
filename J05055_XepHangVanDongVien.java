/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Athlete implements Comparable<Athlete>{
    private String id, name, date, begin, end;
    private int time, time_Bonus, total, stt;
    
    public Athlete(String id, String name, String date, String begin, String end, int time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.begin = begin;
        this.end = end;
        this.time = time;
        this.time_Bonus = this.bonus();
        this.total = this.time - time_Bonus;
    }
    public int bonus(){
        String s = this.date.substring(6);
        int age = 2021 - Integer.parseInt(s);
        if(age <18)
            return 0;
        else if(age < 25)
            return 1;
        else if(age < 32)
            return 2;
        return 3;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getId() {
        return id;
    }
       
    public int getStt(){
        return this.stt;
    }
    
    public int getTime() {
        return time;
    }
    
    public int getTotal(){
        return this.total;
    }
    
    public String convert(int time){
        int h = time/3600,
            m = time / 60,
            s = time % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
    
    @Override
    public int compareTo(Athlete o){
        return Integer.compare(this.total, o.getTotal());
    }
    
    @Override
    public String toString(){
        String realTime = this.convert(time),
               bonusTime = this.convert(this.time_Bonus),
               finalTime = this.convert(total);
        return id + " " + name + " " + realTime + " " + bonusTime + " " + finalTime + " " + this.stt; 
    }
}
public class J05055_XepHangVanDongVien {
    public static int getTime(String s){
        String w[] = s.split(":");      
        int time = Integer.parseInt(w[0]) * 60 * 60 + Integer.parseInt(w[1]) * 60 + Integer.parseInt(w[2]);
        return  time;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Athlete ar[] = new Athlete[t];
        for(int i=0; i<t; i++){
            String id = String.format("VDV%02d", i+1),
                   name = sc.nextLine(),
                   date = sc.nextLine(),
                   begin = sc.nextLine(),
                   end = sc.nextLine();
            int time = getTime(end) - getTime(begin);
            ar[i] = new Athlete(id, name, date, begin, end, time);
        }
        
        Arrays.sort(ar);
        int ind =0;
        for(Athlete x: ar){
            x.setStt(++ind);
        }
        for(int i=1; i<t; i++){
            if(ar[i].getTotal() == ar[i-1].getTotal()){
                int k= ar[i-1].getStt();
                ar[i].setStt(k);
            }
        }
        
        Arrays.sort(ar, new Comparator<Athlete>(){
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o1.getId().compareTo(o2.getId());
            }
        
        });
        
        for(Athlete x: ar){
            System.out.println(x);
        }
    }
}
/*
5
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
*/
