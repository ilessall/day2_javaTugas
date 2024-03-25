/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day2.irsal;

import java.util.Scanner;

/**
 *
 * @author irsal
 */
public class NewClass {
    public static void main(String[] args) {
        int nomorA = 10;
        int nomorB = 20;
        
        double variabel1 = 12;
        double variabel2 = 4;
        
        boolean isPlus = true;
        
        String nama = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("nomorA = "+nomorA);
        System.out.println("nomorB = "+nomorB);
        System.out.println("variabel1 = "+variabel1);
        System.out.println("variabel2 = "+variabel2);
        System.out.println("isPlus = "+isPlus);

        System.out.println("Masukan nomorA baru :");
        nomorA = input.nextInt();
        
        System.out.println("Masukan nomorB baru :");
        nomorB = input.nextInt();
        
        System.out.println("Masukan variabel1 baru :");
        variabel1 = input.nextDouble();
        
        System.out.println("Masukan variabel2 baru :");
        variabel2 = input.nextDouble();
        
        System.out.println("Masukan isPlus baru :");
        isPlus = input.nextBoolean();
        
        System.out.println("Masukan nama kamu :");
        nama = input.nextLine();
        nama = input.nextLine();
        
        System.out.println("nomorA baru = "+nomorA);
        
       
    }
    
}
