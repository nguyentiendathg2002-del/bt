/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;

import java.util.Scanner;
public class B9 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoten = sc.nextLine();
        System.out.print("Tuoi: ");
        String Tuoi = sc.nextLine();
        System.out.print("Lop: ");
        String Lop = sc.nextLine();
        
        System.out.print("Nhap phan tu tu mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("tong cac phan tu = " + sum);
}
}