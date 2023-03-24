/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodayna
 */
    import java.util.Scanner;

public class NewClass {

    

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        System.out.println("please enter x=");
        double x= in.nextDouble();
        
        
        System.out.println("please enter y=");
            double y= in.nextDouble();
            
            if (x > 0 && y > 0)
            System.out.println("QI");
 
        else if (x < 0 && y > 0)
            System.out.println("QII");
 
        else if (x < 0 && y < 0)
            System.out.println("QIII");
 
        else if (x > 0 && y < 0)
            System.out.println("QIV");
 
        else if (x == 0 && y > 0)
            System.out.println("positive y axis");
 
        else if (x == 0 && y < 0)
            System.out.println("negative y axis");
 
        else if (y == 0 && x < 0)
            System.out.println("negative x axis");
 
        else if (y == 0 && x > 0)
            System.out.println("positive x axis");
 
        else
            System.out.println("origin");
    }
       
        
    }

