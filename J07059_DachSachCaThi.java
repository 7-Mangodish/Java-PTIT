
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class CaThi_J07059 implements Comparable<CaThi_J07059>{
    private String id, room;
    private String time;
    private Date cathi;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm"); 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CaThi_J07059(String id, String room,String time) throws ParseException {
        this.id = id;
        this.room = room;
        this.time = time;
        this.cathi = sdf.parse(time);
    }
    
    @Override
    public int compareTo(CaThi_J07059 o){
        if(this.cathi.compareTo(o.cathi)==0)
            return this.id.compareTo(o.id);
        return this.cathi.compareTo(o.cathi);        
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.time + " " + this.room;
    }
}

public class J07059_DachSachCaThi {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
      
        int t = Integer.parseInt(sc.nextLine());
        CaThi_J07059 a[] = new CaThi_J07059[t];
        for(int i=0; i<t; i++){
            String day = sc.nextLine();
            String hour = sc.nextLine();     
            day += " " + hour;
            String room = sc.nextLine();
            a[i] = new CaThi_J07059(String.format("C%03d", i+1), room, day);
        }
        Arrays.sort(a);
        for(CaThi_J07059 x:a)
            System.out.println(x);
    }
}
/*
4
09/01/2022
15:30
70172
09/01/2022
10:00
70279
06/01/2022
15:30
70172
06/01/2022
12:30
70172
*/