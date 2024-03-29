/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class on implements Comparable<on>{
    private String name;
    private long minute ;

    public on(String name, long minute) {
        this.name = name;
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMinute() {
        return minute;
    }

    public void setMinute(long minute) {
        this.minute = minute;
    }

    @Override
    public int compareTo(on o) {
        if(this.minute > o.getMinute())
            return -1;
        if(this.minute == o.getMinute())
            return this.name.compareTo(o.getName());
        return 1;
    }
    
    @Override
    public String toString(){
        return String.format("%s %d", this.name, (int)this.minute/(1000*60) );
    }
}
public class J07084_ThoiGianOnLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<on> arr = new ArrayList<>();
        for(int i=0; i<t; i++){
            // Name
            String name = sc.nextLine();
            // Time
            Date timeIn = sdf.parse(sc.nextLine()),
                 timeOut = sdf.parse(sc.nextLine());
            
            long timeOnline = (timeOut.getTime()-timeIn.getTime())  ;
            arr.add(new on(name, timeOnline));
        }
        Collections.sort(arr);
        for(on x:arr){
            System.out.println(x);
        }
    }
}
