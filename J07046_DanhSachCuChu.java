
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class Time implements Comparable<Time>{
    public static int cnt =1;
    public String id, name, room;
    public long time;
    
    public Time(int id, String name, String room, long time){
        this.id = String.format("KH%02d", cnt++);
        this.name = name;
        this.room = room;
        this.time = time;
    }
    @Override
    public int compareTo(Time o){
        if(this.time > o.time)
            return -1;
        return 1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + room + " "+time;
    }   
}


public class J07046_DanhSachCuChu {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        int n = sc.nextInt();        
        Time a[] = new Time[n];
        sc.nextLine();
        for(int i=0; i<n; i++){            
            String name = sc.nextLine(),
                   room = sc.nextLine();
            Date d1 = sdf.parse(sc.nextLine()),
                 d2 = sdf.parse(sc.nextLine());
            long time = d2.getTime()-d1.getTime();
            time /=(1000*60*60*24);
            a[i] = new Time(i+1, name, room, time);           
            
        }
        Arrays.sort(a);
        for(Time x:a)
            System.out.println(x);
    }
}
