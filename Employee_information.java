public class Employee_information{
    public static void main(String args[]) {
        String emp[][] = { { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
                { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
                { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
                { "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
                { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
                { "1006", "Suman", "1/4/2000", "e", "Manufacturing", "23000", "9000", "4400"},
                { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"} };
        String design[][]={{"e","Engineer","20000"},
                           {"c","Consultant","32000"},
                           {"k","Clerk","12000"},
                           {"r","Receptionist","15000"},
                           {"m","Manager","40000"}};
        int f=0;
        int i=0;
        while(i<emp.length){
            if(emp[i][0].equals(args[0])){
                f=1;

                break;
            }
            i=i+1;
        }
        if(f==1){
        int basic=Integer.parseInt(emp[i][5]);
        int hra=Integer.parseInt(emp[i][6]);
        int it=Integer.parseInt(emp[i][7]);
        System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.print(emp[i][0]+"\t\t"+emp[i][1]+"\t\t"+emp[i][4]+"\t\t");
        int da=0;
         String desig=emp[i][3];
         switch(desig){
            case "e":for(int j=0;i<design.length;j++){
                          if(design[j][0].equals("e")){
                            System.out.print(design[j][1]);
                            da=Integer.parseInt(design[j][2]);
                            break;
                          }
                      }
                      break;
            case "c":for(int j=0;i<design.length;j++){
                        if(design[j][0].equals("c")){
                          System.out.print(design[j][1]);
                          da=Integer.parseInt(design[j][2]);
                          break;
                        }
                     }
                     break;
            case "k":for(int j=0;i<design.length;j++){
                        if(design[j][0].equals("k")){
                          System.out.print(design[j][1]);
                          da=Integer.parseInt(design[j][2]);
                          break;
                        }
                    }
                    break;
            case "r":for(int j=0;i<design.length;j++){
                        if(design[j][0].equals("r")){
                          System.out.print(design[j][1]);
                          da=Integer.parseInt(design[j][2]);
                          break;
                        }
                    }
            case "m":for(int j=0;i<design.length;j++){
                        if(design[j][0].equals("m")){
                          System.out.print(design[j][1]);
                          da=Integer.parseInt(design[j][2]);
                          break;
                        }
                    }
                    break;
            default:System.out.println("Invalid option");
                    break;
         }
         int Salary=basic+hra+da-it;
         System.out.print("\t");
         System.out.print(Salary);
        }
        else{
            System.out.println("There is no employee with empid:"+args[0]);
        }
    }
}
