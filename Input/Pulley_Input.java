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
                    float mass, mu, l, b;
                    float[] s0, u;
                    s0= new float[2];
                    u= new float[2];
                    mu=0;
                    s0[1]=0;
                    u[1]=0;
                    System.out.println("Enter the mass of the object"); //We can replace the onject dynammically
                    mass=scn.nextFloat();
                    System.out.println("Press 1 if you want to consider friction for this object");
                    int toggle= scn.nextInt();
                    if(toggle==1)
                    {
                        System.out.println("Enter the coefficient of friction");
                        mu=scn.nextFloat();
                    }
                    System.out.println("Enter the initial position");
                    s0[0]=scn.nextFloat();
 
                    System.out.println("Enter the initial velocity");  
                    u[0]=scn.nextFloat();


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
                    float r=scn.nextFloat();
                    obj.add(new Sphere(mass, mu, s0, u, limit, obj_type_id,r));
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the radius of the object");
                    float r=scn.nextFloat();
                    System.out.println("Enter the height of the object");
                    float h=scn.nextFloat();
                    obj.add(new Cylinder(mass, mu, s0, u, limit, obj_type_id, r, h));
                    break;
                }
        
                

        }

        limit++;
        }while(limit<2);
    return obj;
}
}
