/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btgd;

import java.util.Scanner;
public class b1 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.printf("nhập số n:");
         int n= sc.nextInt();
         System.out.println("số vừa nhập là:"+n);
         int tong=0;
         for (int i=1;i<=n;i++){

         tong+=i;
         
    }
          System.out.println("Tổng từ 1 đến " + n + " là:"  + tong);
          
          int tongLe = 0;
        for (int i = 1; i < n; i += 2) {
        tongLe += i;
        }
        System.out.println("Tổng các số lẻ nhỏ hơn " + n + " là: " + tongLe);
}
}