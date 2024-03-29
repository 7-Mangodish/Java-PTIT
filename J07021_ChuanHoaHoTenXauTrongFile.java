
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07021_ChuanHoaHoTenXauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.compareTo("END")==0)
                break;
            String w[] = s.trim().split("\\s+");
            for(String x: w){
                System.out.print(x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ");                
            }
            System.out.println("");
        }
    }
}
