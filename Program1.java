/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program1;

/**
 *
 * @author shailesh
 */
class Student{
    String name;
    int enrollment;
    String sub;                   
    //funcation 
    public void study(){
        System.out.println("write here somthing");
        
    }
    public void studyprint(){
        System.out.println(this.name);
        System.out.println(this.enrollment);
        System.out.println(this.sub);
    }
    public void printinfo(String name){
        System.out.println(name);
    }
    public void  printinfo(int enrollment){
        System.out.println(enrollment);
    }
    public void printinfo(String name, int enrollment){
        System.out.println(name+""+enrollment);
    }
//    non-parameterize constructor
//    Student(){
//        System.out.println("constructor is calling");
//    }
//    Student(Student s1){    
//        this.name = s1.name;
//        this.enrollment = s1.enrollment;
//        this.sub = s1.sub;
//        
//    }
//    Student(){
//        
//    }
}
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        st.name= "shailesh";
        st.enrollment = 2147;
        st.sub = "math";
        
        
//        st.name = "shailesh sharma";
//        st.enrollment ="22mca147";
//        st.sub = "java";
//        
//        Student st2 = new Student();
//        st2.name="uttam";
//        st2.enrollment="22mca145";
//        st2.sub="c++";
//        
        
        st.studyprint();
        st.printinfo(st.enrollment);
        
//        st2.studyprint();
//        st.study();
        // TODO code application logic here
    }
    
}
