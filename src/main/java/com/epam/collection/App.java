package com.epam.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
  
    	int n=4; 
    	  
        
        class Data 
        { 
            String id; 
            String name; 
            String email; 
            long phone; 
            int size;
      
            
            Data(String id, String name, String email, long phone,int size) 
            { 
                this.id = id; 
                this.name = name; 
                this.email = email; 
                this.phone = phone; 
                this.size=size;
            } 
        } 
      
        public static void main(String args[]) 
        { 
           Scanner sc=new Scanner(System.in);
           int size;
           System.out.println("enter size : ");
            size =Integer.parseInt(sc.nextLine());
            String[] id=new String[size];
            String[] name=new String[size];
            String[] email=new String[size];
            long[] phone=new long[size];
           
            System.out.println("Enter "+size+" IDs");
            for(int i=0;i<size;i++) {
            id[i]=sc.nextLine();
            }
            System.out.println("Enter "+size+" Names:");
            for(int i=0;i<size;i++) {
            	name[i]=sc.nextLine();
            }
            System.out.println("Enter "+size+" Emails:");
            for(int i=0;i<size;i++) {
            email[i]=sc.nextLine();
            }
            System.out.println("Enter "+size+" Phone Numbers:");
            for(int i=0;i<size;i++) {
            	phone[i]=Long.parseLong(sc.nextLine());
            }
        
            App custom = new App(); 
      
           
            custom.addValues(id, name, email, phone,size); 
            sc.close();
        } 
      
        public void addValues(String id[], String name[], String email[], 
                              long phone[],int size) 
        { 
           
            ArrayList<Data> list=new ArrayList<>(); 
      
            for (int i = 0; i < size; i++) 
            { 
                
                list.add(new Data(id[i], name[i], email[i], phone[i], i)); 
            } 
      
            
            printValues(list,size); 
        } 
      
        public void printValues(ArrayList<Data> list,int size) 
        { 
        	System.out.println("ID		Name			Email					Phonenumber");
            for (int i = 0; i < size; i++) 
            { 
               
                Data data = list.get(i); 
      
                
                System.out.println(data.id+"		"+data.name+"			"+data.email+"				"+data.phone); 
            } 
        } 
}
