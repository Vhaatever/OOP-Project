package Input;
import java.util.ArrayList;
import java.util.Scanner;

import Objt.*;
import Sys.*;
public class Collision_Input {
    static ArrayList<Objects> obj = new ArrayList<Objects>();
 
    public ArrayList<Objects> getSBlocks()
    {
		return this.obj;
	}
 

    public static ArrayList<Objects> initiate()
    {
        Collision col= new Collision();
        col.describe_constraints();
        col.describe_reference();
        Scanner scn= new Scanner(System.in);
        
        System.out.println("Number of objects you want to add?");
        int num_obj= scn.nextInt();

        for(int i=0; i<num_obj; i++)
        {
            Output.legend_object();
            int obj_type_id=scn.nextInt();
            switch(obj_type_id)
            {             
                case 1:
                {

                    float mass, mu, l, b;
                    float[] s0, u;
                    s0= new float[2];
                    u= new float[2];
                    mu=0;
                    s0[1]=0;
                    u[1]=0;
                    System.out.println("Enter the mass of the object"); //We can replace the onject dynammically
                    mass=scn.nextFloat();
                    System.out.println("Enter the length of the object");
                    l=scn.nextFloat();
                    System.out.println("Enter the width of the object");
                    b=scn.nextFloat();
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

                    obj.add(new Solid_Block(mass, mu, s0, u, i, obj_type_id, b, b));
                    break;
                }
                case 2:
                {


                }
            }

        }
        
        return obj;
    }
    
}
