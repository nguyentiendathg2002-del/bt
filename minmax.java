/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;

import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n:");
        n= sc.nextInt();
        int a[]=new int[n];
        System.out.print("nhap phan tu cua mang:");
        for (int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"])=");
        a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>max){max=a[i];}
        }
        System.out.println("so lon nhat la :"+max);
        
        int min=a[0];
        for (int i=1;i<a.length;i++)
        {
            if (a[i]<min){min=a[i];}
        }
        System.out.println("so nho nhat la :"+min);
        

    {

}
    }
    
}
