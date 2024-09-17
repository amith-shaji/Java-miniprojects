package com.mile1.service;
import com.mile1.bean.*;
public class StudentService {
    public int findNumberOfNullMarksArray(Student s[]){
        int c=0;
        try{
        if(s!=null){
            for(Student stud:s){
                if(stud!=null){
                    if(stud.getMarks()==null){
                        c++;
                    }
                }
            }
        }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        return c;
    }
    public int findNumberOfNullName(Student s[]){
        int c=0;
        try{
        if(s!=null){
            for(Student stud:s){
                if(stud!=null){
                    if(stud.getName()==null){
                        c++;
                    }
                }
            }
        }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        return c;
    }
    public int findNumberOfNullObjects(Student s[]){
        int c=0;
        try{
        if(s!=null){
            for(Student stud:s){
                if(stud==null){
                    c++;
                }
            }
        }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        return c;
    }
}
