/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner;
/**
 *
 * @author NTD
 */
public class bt1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("s:Nhập họ và tên");
        String a= sc.nextLine();
        System.out.println("Nhập tuổi:");
        String b= sc.nextLine();
        System.out.println("Nhập Lớp:");
        String c= sc.nextLine();
        
        
        
        Scanner scanner  = new Scanner(System.in);
                float Tong, TB;
        System.out.println("Nhap 3 so: ");
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        float z = scanner.nextInt();
        Tong = x + y +z;
        TB= Tong/3;
        System.out.println("Điểm trung bình là;" +TB);
    }

   
}

        
    
   
