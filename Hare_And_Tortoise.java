class Multithread extends Thread{
    private static boolean raceFinished=false;
    @Override
    public void run(){
    for(int i=0;i<100;i++){
        if (this.getName().equals("Hare") && i==60) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (raceFinished) {
            break;
        }
        System.out.println("Distance covered by "+ Thread.currentThread().getName()+"="+(i+1));
        if((i+1)==100){
         System.out.println(Thread.currentThread().getName()+" completed race");
         raceFinished=true;
         break;
        }
    }
    }
}
public class Hare_And_Tortoise{
    public static void main(String args[]){
           Multithread hare=new Multithread();
           Multithread tortoise=new Multithread();
            hare.setName("Hare");
            tortoise.setName("Tortoise");
            hare.setPriority(10);
            hare.start();
            tortoise.start();
       }
    }