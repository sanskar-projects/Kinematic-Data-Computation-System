import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class digital
{
    float a,v,d,f,fuel,maxSPEED;
    float t=0;
    int delta;
    int flag=0;

    void compute()
    {
    
    t=t+delta;
    if((a!=0)&&(v<maxSPEED))
    {
        v=v+a*t;
    }
    if(v>maxSPEED)
    {
        v=maxSPEED;
    }
    d=d+v*t;
    fuel=fuel-(f*v*t);
    System.out.println("\n\n\n\n\ntime(s):\t"+t+"\nvelocity(m/s):\t"+v+"\ndistance(m):\t"+d+"\nfuel remaining:\t"+fuel);
    try 
    {
    FileWriter writer=new FileWriter("data.txt",true);
    writer.write("\n\n\n\n\ntime(s):\t"+t+"\nvelocity(m/s):\t"+v+"\ndistance(m):\t"+d+"\nfuel remaining:\t"+fuel);
    writer.close();
    }
    catch(IOException e)
    {
        flag=1;
    }
    }
    
    void fuelWARNING()
    {
        if(fuel<10)
        {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tWARNING!\n\t\t\t\t\t\t\t\t\t\t\t\tLOW FUEL");
            try
            {
            FileWriter writer=new FileWriter("data.txt",true);
            writer.write("\n\t\t\t\t\t\t\t\t\t\t\t\tWARNING!\n\t\t\t\t\t\t\t\t\t\t\t\tLOW FUEL");
            writer.close();
            }
            catch(IOException e)
            {
                flag=1;
            }
        }
    }
    
    void speedWARNING()
    {
       if(v>=maxSPEED)
        {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tWARNING!\n\t\t\t\t\t\t\t\t\t\t\t\tMAXIMUM SPEED REACHED");
            try
            {
            FileWriter writer=new FileWriter("data.txt",true);
            writer.write("\n\t\t\t\t\t\t\t\t\t\t\t\tWARNING!\n\t\t\t\t\t\t\t\t\t\t\t\tMAXIMUM SPEED REACHED");
            writer.close();
            }
            catch(IOException e)
            {
                flag=1;
            }
        } 
    }
}

public class Main
{
    public static void main(String[] args)
    {
    digital obj=new digital();
    Scanner scan=new Scanner(System.in);
    System.out.println("\nWhat's the acceleration now?(m/s^2):");
    obj.a=scan.nextFloat();
    System.out.println("\nWhat's the velocity now?(m/s):");
    obj.v=scan.nextFloat();
    System.out.println("\nHow much distance has been covered?(m):");
    obj.d=scan.nextFloat();
    System.out.println("\nWhat's the fuel consumption rate?(L/m):");
    obj.f=scan.nextFloat();
    System.out.println("\nWhat's the quantity of fuel available now?(L):");
    obj.fuel=scan.nextFloat();
    System.out.println("\nWhat is the time interval between succesive computations?(s):");
    obj.delta=scan.nextInt();   
    System.out.println("\nWhat's the maximum speed limit?(m/s):");
    obj.maxSPEED=scan.nextFloat();   
    System.out.println("\n------------------------DATA COMPUTED------------------------\n");
    System.out.println("\n\n\n\n\ntime(s):\t"+obj.t+"\nacceleration:\t"+obj.a+"\nvelocity(m/s):\t"+obj.v+"\ndistance(m):\t"+obj.d+"\nfuel consumption\t"+obj.f+"\nfuel remaining:\t"+obj.fuel+"\ntime interval:\t"+obj.delta);
    try 
    {
    FileWriter writer=new FileWriter("data.txt",true);
    writer.write("\n------------------------DATA COMPUTED------------------------\n");
    writer.write("\n\n\n\n\ntime(s):\t"+obj.t+"\nacceleration:\t"+obj.a+"\nvelocity(m/s):\t"+obj.v+"\ndistance(m):\t"+obj.d+"\nfuel consumption\t"+obj.f+"\nfuel remaining:\t"+obj.fuel+"\ntime interval:\t"+obj.delta);
    writer.close();
    }
    catch(IOException e)
    {
        obj.flag=1;
    }
    while(obj.fuel>0)
    {
        obj.compute();
        
        obj.speedWARNING();
        obj.fuelWARNING();
    }
    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\tWARNING!\n\t\t\t\t\t\t\t\t\t\t\t\tFUEL EMPTY");
    try
    {
    FileWriter writer=new FileWriter("data.txt",true);
    writer.write("\n\n\n\n\nFUEL EMPTY\n");
    writer.close();
    }
    catch(IOException e)
    {
        obj.flag=1;
    }
    if(obj.flag==0)
    {
        System.out.println("\n\n\n\n\ndata has been backed up");  
    }
    else
    {
        System.out.println("\n\n\n\n\nError!\ndata hasn't been backed up");
    }
}
}
