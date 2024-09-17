package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;
public class StudentReport {
    public String findGrades(Student studentObject){
        int sum=0;
        String grade="";
        int[] marks=studentObject.getMarks();
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
            if(marks[i]<35){
                grade="F";
                return grade;
            }
        }
            if(sum<150){
                grade="C";
            }
            else if(sum<200 && sum>=150){
                grade="B";
            }
            else if(sum<250 && sum>=200){
             grade="A";
            }
            else grade="A+";
            return grade;
        }
        public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException{
            if(s==null){
                throw new NullStudentObjectException();
            }
            else{
                if(s.getName()==null) throw new NullNameException();
                else if(s.getMarks()==null) throw new NullMarksArrayException();
                else return "VALID";
            }
        }
    }
