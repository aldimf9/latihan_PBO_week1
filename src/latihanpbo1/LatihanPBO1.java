/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo1;

/**
 *
 * @author Aldi M F
 */
import java.util.Scanner;
public class LatihanPBO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n,bilTerkecil=0;
        String nama[];
        int umur[];
        
        System.out.print("Masukkan Jumlah Orang : ");
        n = input.nextInt();
        nama = new String[n];
        umur = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nama Orang ke-"+(i+1)+" : ");
            nama[i]=input.next();
            System.out.print("Umur : ");    
            umur[i]=input.nextInt();
        }
        
        for(int i=1;i<n;i++){
            if(umur[bilTerkecil] > umur[i]){
                bilTerkecil = i;
            }
        }
        System.out.println("Umur terkecil ialah : "+umur[bilTerkecil]+" yang bernama "+nama[bilTerkecil]);
    }
    
}
