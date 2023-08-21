
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagment;

import java.util.Scanner;

class Student{
int studentid=22147;
String name="shailesh";
float sub;
 float s1;
 float s2;
 float s3;
 float s4;
 float s5;

public void check(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a userid");
    String uname = sc.nextLine();
    int id = sc.nextInt();
    if(id==studentid && (uname == null ? name == null : uname.equals(name))){
        System.out.println("Welcome to Student portal "+name);
      option();
    }
}
    public void option(){
        System.out.println("Please enter your choice.........");
        System.out.println("1. Enter a Student Result");
        System.out.println("2. Check a student result");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            addmarks();
            
        }
        else if(choice==2){
            result();
            
        }
        else{
            System.out.println("Enter a Valid Choice");
        }
        
    }
    public void addmarks(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Eneter a number of Subject");
        s1 = sc.nextFloat();
        s2 = sc.nextFloat();
        s3 = sc.nextFloat();
        s4 = sc.nextFloat();
        s5 = sc.nextFloat();
        option();
        
    }
    public void result(){
        System.out.println("This a result of "+name);
        sub=s1+s2+s3+s4+s5;
        System.out.println(name+" your result is"+sub);
        double percentage = (sub/500)*100;
        if(percentage>35){
           System.out.println(name+" your result in Percentage "+percentage+" PASS"); 
           option();
        }
        else{
        System.out.println(name+" your result in Percentage"+percentage+" Fail");
        option();

        }

    }}
public class Studentmanagment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        st.check();
        // TODO code application logic here
    }
    
}
