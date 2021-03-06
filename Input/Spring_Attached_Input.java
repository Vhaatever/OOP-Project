package Input;

import java.util.ArrayList;
import java.util.Scanner;

import Objt.Objects;
import Objt.Spring;
import Sys.Spring_Attached;

public class Spring_Attached_Input extends Input{
    static ArrayList<Object> obj = new ArrayList<Object>();
    private static Scanner scn = new Scanner(System.in);
 
    public ArrayList<Objects> getSBlocks()
    {
		return Collision_Input.obj;
	}
 

    public static ArrayList<Object> initiate()
    {
        Spring_Attached spring= new Spring_Attached();
        spring.describe_constraints();
        Spring.describe_constraints();
        spring.describe_reference();
        Output.legend_object();
            int obj_type_id=scn.nextInt();
                double mass, mu;
                double[] s0, u;
                s0= new double[2];
                u= new double[2];
                mu=0;
                System.out.println("Enter the mass of the object (in kg)"); //We can replace the onject dynammically
                mass=scn.nextDouble();
                System.out.println("Enter the initial Displacement (in m)"); 
                s0[0]=scn.nextDouble(); 
                double k;
                System.out.println("Enter the Spring coefficient for the spring (in N/m)");
                k= scn.nextDouble();
                obj.add(new Spring(k));
                
        int i=1; //for object
        
        entry_object(obj, obj_type_id, mass, mu, s0, u, i);

        return obj;
      
            }


}
