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
		return obj;
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
                    System.out.println("Enter the mass of the object (in kg)"); //We can replace the onject dynammically
                    mass=scn.nextDouble();
                
                    
                 boolean toggle= true;
                    
                 while(toggle)
                 {System.out.println("Enter the initial position (in m)");
                    double f1=scn.nextDouble();
                     if(f1>0)
                    {
                        s0[1]=f1;
                        toggle=false;
                    }
                    else{
                        System.out.println("Can only take postiive values\n");
                    }
                }
            switch(obj_type_id)
            {             
                case 1:
                {                  
                    System.out.println("Enter the length of the object(in m)");
                    l=scn.nextDouble();
                    System.out.println("Enter the width of the object(in m)");
                    b=scn.nextDouble();
                    obj.add(new Solid_Block(mass, mu, s0, u, limit, obj_type_id, l, b));
                    break;
                   
                }
                case 2:
                {
                    System.out.println("Enter the radius of the object(in m)");
                    double r=scn.nextDouble();
                    obj.add(new Sphere(mass, mu, s0, u, limit, obj_type_id,r));
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the radius of the object (in m)");
                    double r=scn.nextDouble();
                    System.out.println("Enter the height of the object (in m)");
                    double h=scn.nextDouble();
                    obj.add(new Cylinder(mass, mu, s0, u, limit, obj_type_id, r, h));
                    break;
                }
        
                

        }

        limit++;
        }while(limit<2);
    return obj;
}
}
