package Input;
import Objt.*;
import Objt.Objects;
import java.util.*;
import Sys.*;

public class Wedge_Input {
    static ArrayList<Object> obj = new ArrayList<Object>();
    private static Scanner scn = new Scanner(System.in);
 
    public ArrayList<Objects> getSBlocks()
    {
		return Collision_Input.obj;
	}
 

    public static ArrayList<Object> initiate()
    {
        WedgeSys wedge= new WedgeSys();
        wedge.describe_constraints();
        Wedge.describe_constraints();
        wedge.describe_reference();
        
        Output.legend_object();
            int obj_type_id=scn.nextInt();
                double mass, mu, l, b;
                double[] s0, u;
                s0= new double[2];
                u= new double[2];
                mu=0;
                    System.out.println("Enter the mass of the object"); //We can replace the onject dynammically
                    mass=scn.nextFloat();
                    System.out.println("Press 1 if you want to consider friction for this object");
                    int toggle= scn.nextInt();
                    if(toggle==1)
                    {
                        System.out.println("Enter the coefficient of friction");
                        mu=scn.nextFloat();
                    }
int i=1; //for object
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

        System.out.println("Enter the angle of inclination for the wedge");
        double angle= scn.nextInt();
        angle= Math.toRadians(angle);
        obj.add(new Wedge(angle));
       
        return obj;
    }

    
}
