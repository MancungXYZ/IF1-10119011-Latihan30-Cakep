/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama     : Reihan Wiyanda
 *  Kelas    : IF-1
 *  Nim      : 10119011
 */
public class IF110119011Latihan30Cakep {

    //https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
        public static final String ANSI_RESET = "\u001b[0m";
        public static final String ANSI_RED = "\u001b[31m";
        public static final String ANSI_YELLOW = "\u001b[33m";
        public static final String ANSI_BLUE = "\u001b[34m";
        public static final String ANSI_MAGENTA = "\u001b[35m";
        public static final String ANSI_CYAN = "\u001b[36m";
        public static final String ANSI_GREEN = "\u001b[32m";
   
        
    public static void main(String[] args) {
        String jawab;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("" + ANSI_RED + "Kamu " + ANSI_RESET);
        System.out.print("" + ANSI_GREEN + " ngerjain sendiri " + ANSI_RESET);
        System.out.print("" + ANSI_YELLOW +" latihan 17 sampai " + ANSI_RESET);
        System.out.print("" + ANSI_BLUE + " latihan 30 ini? jawab " + ANSI_RESET);
        System.out.print("" + ANSI_RED + " (Yoi/Tidak) : " + ANSI_RESET);
        jawab = sc.next();
        String jawaban = jawab.toUpperCase();
            if (jawaban.equals("YOI")) {
                System.out.print("" + ANSI_RED + "Cakep bener " + ANSI_RESET);
                System.out.print("" + ANSI_MAGENTA + " Good Job " + ANSI_RESET);
            } else {
                System.out.println("" + ANSI_RED + "Tetep cakep sih" + ANSI_RESET);
                System.out.println("" + ANSI_CYAN + "Sing penting paham konsep nya yee." + ANSI_RESET);
                System.out.println("Keep the code works");
            }
        
        
    }
    
}
