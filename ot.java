/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;

import java.util.Scanner;
public class ot {
    
    public static void main(String[] args) {
         int a;
    Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a:");
        a=sc.nextInt();
        if (a%2==0){
            System.out.println("a la so chan");       
        }
        else{
            System.out.println("a la so le");
        }
    }
}
