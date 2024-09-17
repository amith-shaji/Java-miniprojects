import java.util.Scanner;
class Video{
    String videoName;
    boolean checkout;
    int rating;
    Video(String name){
        videoName=name.toUpperCase();
        checkout=false;
        rating=0;
        System.out.println("Video \""+name+"\" added successfully");
    }
    String getName(){
        return this.videoName;
        
    }
    void doCheckout(){
        this.checkout=true;
        System.out.println("Video \""+videoName+"\" checked out successfully");
    }
    void doReturn(){
        this.checkout=false;
        System.out.println("Video \""+videoName+"\" returned  successfully");
        
    }
    void receiveRating(int rating){
        this.rating=rating;
        System.out.println("Rating "+rating+ "has been mapped to the Video \""+videoName+"\"");
    }
    int getRating(){
        return rating;
        
    }
    boolean getCheckout(){
        return checkout;
        
    }
    
}
class Videostore{
    
    private Video [] store;
    static int nextslot=0;

    {
        store=new Video[5];
    }
    void addVideo(String name){
        if(nextslot<store.length){
                store[nextslot]=new Video(name);
                nextslot++;
        }
        
    }
    void doCheckout(String name){
        for(int i=0;i<nextslot;i++){
            if(store[i].getName().equals(name.toUpperCase()) && !store[i].getCheckout()){
                store[i].doCheckout();
                break;
            }
        }
        
    }
    void doReturn(String name){
        for(int i=0;i<nextslot;i++){
            if(store[i].getName().equals(name.toUpperCase()) && store[i].getCheckout()){
                store[i].doReturn();
                break;
            }
        }
        
    }
    void receiveRating(String name,int rating){
         for(int i=0;i<nextslot;i++){
            if(store[i].getName().equals(name.toUpperCase())){
                store[i].receiveRating(rating);
                break;
            }
        }
    }
    void listInventory(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Video Name     |      Checkout Status   |     Rating ");
        for(int i=0;i<nextslot;i++){
            if(store[i]!=null){
                System.out.printf("%s            |      %s                  |         %d       \n",store[i].getName(),store[i].getCheckout(),store[i].getRating());
            }
        }
        System.out.println("---------------------------------------------------------");
    }
    
}
public class Video_rental_inventory_system {
    public static void main(String args[]) {
        int choice;
        Videostore vstore=new Videostore();
      do{
          Scanner scanner=new Scanner(System.in);
          System.out.println("MAIN MENU \n ========= \n1.Add Video:\n2.Check Out Video:\n3.Return Video:\n4.Receive Rating:\n5.List Inventory:\n6.Exit:\nEnter your choice (1..6):");
          choice=scanner.nextInt();
          switch(choice){
              case 1:System.out.println("Enter the name of the video you want to add:");
                     String name1=scanner.next();
                     vstore.addVideo(name1);
                     break;
              case 2:System.out.println("Enter the name of the video you want to checkout:");
                     String name2=scanner.next();
                     vstore.doCheckout(name2);
                     break;
              case 3:System.out.println("Enter the name of the video you want to Return:");
                     String name3=scanner.next();
                     vstore.doReturn(name3);
                     break;
              case 4:System.out.println("Enter the name of the video you want to Rate:");
                     String name=scanner.next();
                     System.out.println("Enter the rating for this video:");
                     int rate=scanner.nextInt();
                     scanner.nextLine();
                     vstore.receiveRating(name,rate);
                     break;
              case 5:vstore.listInventory();
                     break;
              case 6:System.out.println("Exiting...!! Thanks for using the application.");
                     break;
              default:System.out.println("Invalid");
                      break;
              
          
          }
      }while(choice!=6);
    }
}