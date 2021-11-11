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
    System.out.println("Input Time");
    float time =scn.nextInt();
    System.out.println("Input Time");
    float delta= scn.nextInt();
    float slice = op.calc_iterations(time, delta);
   
    sys_ID=scn.nextInt();
    ArrayList<Objects> obj = new ArrayList<Objects>();
    switch(sys_ID)
    {
        
        case 1:
        {
            obj.addAll(Collision_Input.initiate());
            Collision.simulate(obj, slice);
            break;
        }
        case 2:
        {

        }
    }

    }
}


