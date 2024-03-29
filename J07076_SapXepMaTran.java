/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n= sc.nextInt(),
                m = sc.nextInt(),
                c = sc.nextInt();
            int a[][] = new int[n][m];
            ArrayList <Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    int tmp = sc.nextInt();
                    a[i][j]=tmp;
                    if(j==c-1){
                        arr.add(tmp);
                    }
                }
            }
            Collections.sort(arr);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(j==c-1)
                        System.out.print(arr.get(i) + " ");
                    else
                        System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        }

    }
}
