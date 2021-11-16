package Input;

import java.util.ArrayList;
import java.util.Scanner;

import Objt.*;
import Sys.PulleySys;

public class Pulley_Input {
    static ArrayList<Objects> obj = new ArrayList<Objects>();

     static Scanner scn= new Scanner(System.in);
    public ArrayList<Objects> getSBlocks()
    {
		return Collision_Input.obj;
	}
 

    public static ArrayList<Objects> initiate()
    {
        PulleySys pul= new PulleySys();
        pul.describe_constraints();
        pul.describe_reference();
        int limit=0;
        do
        {
            Output.legend_object();
            int obj_type_id=scn.nextInt();
                    double mass, mu, l, b;
                    double[] s0, u;
                    s0= new double[2];
                    u= new double[2];
                    mu=0;
                    s0[0]=0;
                    u[0]=0;
                    System.out.println("Enter the mass of the object"); //We can replace the onject dynammically
                    mass=scn.nextFloat();
                
                    System.out.println("Enter the initial position");
                    s0[1]=scn.nextFloat();
 
                    System.out.println("Enter the initial velocity");  
                    u[1]=scn.nextFloat();


            switch(obj_type_id)
            {             
                case 1:
                {                  
                    System.out.println("Enter the length of the object");
                    l=scn.nextFloat();
                    System.out.println("Enter the width of the object");
                    b=scn.nextFloat();
                    obj.add(new Solid_Block(mass, mu, s0, u, limit, obj_type_id, l, b));
                    break;
                   
                }
                case 2:
                {
                    System.out.println("Enter the radius of the object");
                    double r=scn.nextFloat();
                    obj.add(new Sphere(mass, mu, s0, u, limit, obj_type_id,r));
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the radius of the object");
                    double r=scn.nextFloat();
                    System.out.println("Enter the height of the object");
                    double h=scn.nextFloat();
                    obj.add(new Cylinder(mass, mu, s0, u, limit, obj_type_id, r, h));
                    break;
                }
        
                

        }

        limit++;
        }while(limit<2);
    return obj;
}
}
