package com.mile1.bean;
public class Student{
        private String name;
        private int marks[];
        private String grade;
        public Student(){

        }
        public Student(String name,int[] marks){
            super();
            this.marks=marks;
            this.name=name;
            
        }
        public String getName(){
            return this.name;
        }
        public int[] getMarks(){
            return this.marks;
        }
        public String getGrade(){
            return this.grade;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setMarks(int[] marks){
            this.marks=marks;
        }
        public void setGrade(String grade){
            this.grade=grade;
        }
    
}