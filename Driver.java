import java.util.ArrayList;
import java.util.Scanner;
import Input.*;
import Objt.*;
public class Driver extends Output
   { public static void main(String[] args)
    {

    int N;  // no. of objects   
    int n;  // no. of iterations
    int sys_ID;
    Output op= new Output();
    op.start_screen();
    op.describe_systems();
    op.legend_system();
    Scanner scn= new Scanner(System.in);
    sys_ID=scn.nextInt();

    switch(sys_ID)
    {
        case 1:
        {
            ArrayList <Solid_Block> sBlocks= new ArrayList<Solid_Block>();
            ArrayList <Sphere> sphere= new ArrayList<Sphere>();
            ArrayList <Cylinder> cylinder= new ArrayList<Cylinder>();

            Collision_Input start= new Collision_Input();
            start.start();
            sBlocks= start.start();
            
            break;
        }
    }

    }
}


