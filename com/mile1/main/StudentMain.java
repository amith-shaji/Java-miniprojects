package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.service.*;
public class StudentMain {
    static Student data[]=new Student[10];
    StudentMain(){
        for(int i=0;i<data.length;i++){
            data[i]=new Student();
        }
        data[0]=new Student("Sekar",new int[] {85,75,95});
        data[1]=new Student(null,new int[] {11,22,33});
        data[2]=null;
        data[3]=new Student("Manoj",null);
        data[4]=new Student("John",new int[] {90,92,80});
        data[5]=new Student("Bob",new int[] {35,40,50});
        data[6]=new Student("Alice",new int[] {25,29,28});
        data[7]=null;
        data[8]=new Student(null,new int[] {25,29,28});
        data[9]=new Student("Arnold",null);
    }
    public static void main(String[] args) {
        new StudentMain();
        StudentReport obj=new StudentReport();
        String str1;
        String grade1;
        for(int i=0;i<data.length;i++){
            try{
            str1="";
            str1=obj.validate(data[i]);
            if(str1.equals("VALID")){
                grade1=obj.findGrades(data[i]);
                System.out.println("\nName="+data[i].getName()+"\tGrade="+grade1);
              }
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        StudentService obj1=new StudentService();
        int m;
        m=obj1.findNumberOfNullMarksArray(data);
        System.out.println("Number of Null Marks Array = "+m);
        m=obj1.findNumberOfNullName(data);
        System.out.println("Number of Null Name = "+m);
        m=obj1.findNumberOfNullObjects(data);
        System.out.println("Number of Null Objects= "+m);
    }
}
