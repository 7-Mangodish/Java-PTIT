/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
        
class Time{
    private String id, name;
    private int hour, min;

    public Time(String id, String name, int hour, int min) {
        this.id = id;
        this.name = name;
        this.hour = hour;
        this.min = min;
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

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d gio %d phut", id, name, hour, min);
    }
}
public class J05011_TInhGio {
    public static int getTime(String s){
        String w[] = s.split(":");
        int h = Integer.parseInt(w[0]),
            m = Integer.parseInt(w[1]);
        int ans = h*60 + m;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Time> ar= new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            String in = sc.nextLine();
            String out = sc.nextLine();
            
            int timeIn = getTime(in),
                timeOut = getTime(out);
            
            int min = timeOut - timeIn;
            int hour = min/60;
            min %=60;
            ar.add(new Time(id, name, hour, min));
        }
        Collections.sort(ar, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getHour() > o2.getHour())
                    return -1;
                else if(o1.getHour() == o2.getHour())
                    return -Integer.compare(o1.getMin(), o2.getMin());
                return 1;
            }           
        });
        for(Time x:ar){
            System.out.println(x);
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/