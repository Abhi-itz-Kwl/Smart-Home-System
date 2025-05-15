import java.util.*;
import java.util.Scanner;
public class SmartHomeSystem
{
    static int lights=0;
    static int FAN=0;
    static int AC=0;
    static int temperature=24;
    static int Door=0;
    static String fanspeed="OFF";
     static final String ADMIN_PASSWORD = "Abhi123";
		 
    static int lightTime = 0;
    static int fanTime = 0;
    static int acTime = 0;
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("---Smart Home System---");
	    System.out.println("1.Turn ON lights");
	    System.out.println("2.Turn OFF lights");
	    System.out.println("3.Turn ON Fan");
	    System.out.println("4.Turn OFF Fan");
	    System.out.println("5.Turn ON AC");
	    System.out.println("6.Turn OFF AC");
	    System.out.println("7.Lock Door");
	    System.out.println("8.Unlock Door");
	    System.out.println("9.Show status");
	    System.out.println("10.Show EnergyUsage");
	    System.out.println("0.Exit");
		int n;
		int n2;
		do
		{
		    System.out.println("..........................");
		    System.out.println("Enter your choice:");
	            n=in.nextInt();
	            switch(n){
	                case 1:
	                   lights=1;
	                   lightTime++;
	                   System.out.println(">>> Lights Turned ON");
	                   break;
	                case 2:
	                    lights=0;
	                    System.out.println(">>> Lights Turned OFF");
	                    break;
	                case 3:
	                    FAN=1;
	                    fanTime++;
	                    System.out.println(">>> Turned ON FAN");
	                    fanspeed();
	                     break;
	                case 4:
	                     FAN=0;
	                     System.out.println(">>> Turned OFF FAN");
	                     break;
	                case 5:
	                    AC=1;
	                    acTime++;
	                    System.out.println(">>> Turned ON AC");
	                    System.out.println("Enter temperature (\u00B0C):");
	                    int n1=in.nextInt();
	                    System.out.println(">>> Temperature set to: "+n1+"(\u00B0C)");
	                    break;
	               case 6:
	                   AC=0;
	                   System.out.println(">>> Turned OFF AC");
	                   break;
	              case 7:
	                    Door=0;
	                    System.out.println(">>> Door Locked");
	                    break;
	              case 8:
	                   if(checkPassword()){
	                           Door=1;
	                          System.out.println(">>> Door unlocked");
	                   }
	                   break;
	              case 9:
	                   System.out.println("---Device Status---");
	                   showstatus();
	                    break;
	             case 10:
	                 showEnergyUsage();
	                  break;
	              case 0:
	                    System.out.print("> Exiting Smart Home System---");
	                    break;
	             default:
	                    System.out.print("Invalid option!");
	                     break;
	            }
		}while(n>0);
	}
	
	    public static boolean checkPassword() {
                   System.out.print("> Enter password: ");
                   String pw = in.next();
                  if (!pw.equals(ADMIN_PASSWORD)){
                        System.out.println(">>> Access denied.");
                        return false;
                   }
                   return true;
             }
	    public static void fanspeed()
	    {
	            System.out.println(">Choose fan speed:");
		    System.out.println("1.Low");
		    System.out.println("2.Medium");
		    System.out.println("3.High");
		    System.out.println("Enter your choice:");
		    int n2=in.nextInt();
		    if(n2==1)
		        fanspeed="low";
		    else if(n2==2)
		        fanspeed="middle";
		    else
		        fanspeed="high";
	    }
	     public static void showstatus()
	    {
	        System.out.println("Lights :"+((lights==1)?"ON":"OFF"));
	        System.out.println("FAN    :"+((FAN==1)?"ON":"OFF")+" (FAN speed :"+ fanspeed+")");
	        System.out.println("AC     :"+((AC==1)?"ON":"OFF")+"  (Temp :" + temperature + "°C)");
	        System.out.println("Door   :"+((Door==1)?"UNLOCKED":"LOCKED"));
	    }
	    public static void showEnergyUsage() {
                double lightEnergy = 5 * lightTime / 60.0;
                double fanEnergy   = 70 * fanTime / 60.0;
                double acEnergy    = 1500 * acTime / 60.0;
                double total = lightEnergy + fanEnergy + acEnergy;
                System.out.println("---Energy Usage Report---");
                System.out.printf("Lights : %.2f Wh%n", lightEnergy);
                System.out.printf("Fan    : %.2f Wh%n", fanEnergy);
                System.out.printf("AC     : %.2f Wh%n", acEnergy);
                System.out.printf("Total  : %.2f Wh%n", total);
            }
}
