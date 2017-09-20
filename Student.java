       
import.java.io.*;
import.java.util.Scanner;
public static void Main( String[] args)
{
     int n,total=0,percentage;
     Scanner s = new Scanner(System.in);
     System.out.println("enter the  no of subject");
     n= s.nextInt();
     int marks[]=new int[10];
      System.out.println("enter the marks out of 100");
      for(int i=0;i<n;i++)
      {
            marks[i]=s.nextInt();
           total = total + marks[i];
      }
         percentage= total/n;
        System.out.println("Sum:" +total); 
        System.out.println("percentage" +percentage); 
   }  
      
        
     
       
     
