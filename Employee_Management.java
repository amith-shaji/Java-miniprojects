import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Employee_Management {
    public static void addEmployee(String empdetails){
            try{
            File file=new File("employee.txt");
            FileWriter fw=new FileWriter(file,true);
            fw.write(empdetails);
            fw.flush();
            }
            catch(Exception e){
                     System.out.println(e);
            }
    }
    public static void displayEmployee(){
        try{
            String content;
            File file=new File("employee.txt");
            BufferedReader br=new BufferedReader(new FileReader(file));
            System.out.println("-----------Report----------");
            while((content=br.readLine())!=null){
               String strw=content.replace(",","  ");
               System.out.println(strw);
            }
            }
            catch(Exception e){
                     System.out.println(e);
            }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Main Menu\n1.Add an Employee\n2.Display All\n3.Exit");  
            choice=scanner.nextInt();
        switch(choice){
            case 1:System.out.println("Enter Employee ID:");
                   int empid=scanner.nextInt();
                   scanner.nextLine();
                   System.out.println("Enter Employee Name:");
                   String empname=scanner.nextLine();
                   System.out.println("Enter Employee Age:");
                   int empage=scanner.nextInt();
                   System.out.println("Enter Employee Salary:");
                   float empsalary=scanner.nextFloat();
                   String empdetails=String.format("%d,%s,%d,%.2f\n",empid,empname,empage,empsalary);
                   addEmployee(empdetails);
                   break;
            case 2:displayEmployee();
                    break;
            case 3:break;

        }
    }while(choice!=3);
        
    }
}
