package haromszog;

import java.util.Scanner;

public class Haromszog {

    //ez egy jó feladat volt

    //ez a codespace-ről jött

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int a,b,c = 0;
        
        System.out.println("Második feladat!");
        
        System.out.println("Kérem az 'a' oldal hosszát:");
        a = sc.nextInt();
        
        System.out.println("Kérem a 'b' oldal hosszát:");
        b = sc.nextInt();
        
        System.out.println("Kérem a 'c' oldal hosszát:");
        c = sc.nextInt();
        
        if ((a+b) > c && (a+c) > b && (b+c) > a)
        {
            System.out.println("Ezek a számok 'háromszög számok'!");
        }
        else
        {
            System.out.println("Ezek a számok nem 'háromszög számok'!");
        }
		//created by Myxy
    }
    
}
