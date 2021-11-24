import java.util.ArrayList;
import java.util.Scanner;
import Input.*;
import Objt.*;
import Sys.*;
public class Driver extends Output
   { private static Scanner scn = new Scanner(System.in);

public static void main(String[] args)
    {
    int sys_ID;
    Output op= new Output();
    op.start_screen();
    op.describe_systems();
    op.legend_system();
  
    sys_ID=scn.nextInt();
    System.out.println("Input Time");
    double time =scn.nextDouble();
    System.out.println("Number of iterations");
    int delta= scn.nextInt();
    double slice = op.calc_iterations(time, delta);
   
    switch(sys_ID)
    {
        
        case 1:
        {
            ArrayList<Objects> obj = new ArrayList<Objects>();

            obj.addAll(Collision_Input.initiate());
            Collision col= new Collision();
            col.simulate(obj, slice, delta);
            break;
        }
        case 2:
        {
            ArrayList<Object> obj = new ArrayList<Object>();
            obj.addAll(Wedge_Input.initiate());
            WedgeSys wedge= new WedgeSys();
            wedge.simulate(obj, slice, delta);
            break;
        }
        case 3:
        {
            ArrayList<Object> obj = new ArrayList<Object>();
            obj.addAll(Spring_Attached_Input.initiate());
            Spring_Attached spring= new Spring_Attached();
            spring.simulate(obj, slice, delta);
            break;
        }
        case 4:
        {
            ArrayList<Objects> obj= new ArrayList<Objects>();
            obj.addAll(Pulley_Input.initiate());
            PulleySys pulley= new PulleySys();
            pulley.simulate(obj, slice, delta);
            break;
        }
    } 

    }
}


