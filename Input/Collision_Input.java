package Input;
import java.util.ArrayList;
import java.util.Scanner;

import Objt.*;
import Sys.*;
public class Collision_Input extends Input{
    static ArrayList<Objects> obj = new ArrayList<Objects>();
    private static Scanner scn = new Scanner(System.in);
 
    public ArrayList<Objects> getSBlocks()
    {
		return Collision_Input.obj;
	}

public static ArrayList<Objects> initiate()
    {
        Collision col= new Collision();
        col.describe_constraints();
        col.describe_reference();
        System.out.println("Number of objects you want to add?");
        int num_obj= scn.nextInt();

        for(int i=0; i<num_obj; i++)
        {
            Output.legend_object();
            int obj_type_id=scn.nextInt();
                    double mass, mu, l,b ;
                    double[] s0, u;
                    s0= new double[2];
                    u= new double[2];
                    mu=0;
                    s0[1]=0;
                    u[1]=0;
                    System.out.println("Enter the mass of the object"); //We can replace the onject dynammically
                    mass=scn.nextDouble();
                    System.out.println("Press 1 if you want to consider friction for this object");
                    int toggle= scn.nextInt();
                    if(toggle==1)
                    {
                        System.out.println("Enter the coefficient of friction");
                        mu=scn.nextDouble();
                    }
                    System.out.println("Enter the initial position");
                    s0[0]=scn.nextDouble();
 
                    System.out.println("Enter the initial velocity");  
                    u[0]=scn.nextDouble();
                    switch(obj_type_id)
                    {             
                        case 1:
                        {                  
                            System.out.println("Enter the length of the object");
                            l=scn.nextFloat();
                            System.out.println("Enter the width of the object");
                            b=scn.nextFloat();
                            obj.add(new Solid_Block(mass, mu, s0, u, i, obj_type_id, l, b));
                            break;
                           
                        }
                        case 2:
                        {
                            System.out.println("Enter the radius of the object");
                            double r=scn.nextFloat();
                            obj.add(new Sphere(mass, mu, s0, u, i, obj_type_id,r));
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter the radius of the object");
                            double r=scn.nextFloat();
                            System.out.println("Enter the height of the object");
                            double h=scn.nextFloat();
                            obj.add(new Cylinder(mass, mu, s0, u, i, obj_type_id, r, h));
                            break;
                        }                    
        }
        
      
    }

    return obj;
}}

    
