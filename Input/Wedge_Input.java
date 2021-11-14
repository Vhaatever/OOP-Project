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
                float mass, mu, l, b;
                float[] s0, u;
                s0= new float[2];
                u= new float[2];
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
                    System.out.println("Enter the initial position along x");
                    s0[0]=scn.nextFloat();
                    System.out.println("Enter the initial position along y");
                    s0[1]=scn.nextFloat();
 
                    System.out.println("Enter the initial velocity along x");  
                    u[0]=scn.nextFloat();
                    System.out.println("Enter the initial velocity along y");  
                    u[1]=scn.nextFloat();
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
                    float r=scn.nextFloat();
                    obj.add(new Sphere(mass, mu, s0, u, i, obj_type_id,r));
                }
                case 3:
                {
                    System.out.println("Enter the radius of the object");
                    float r=scn.nextFloat();
                    System.out.println("Enter the height of the object");
                    float h=scn.nextFloat();
                    obj.add(new Cylinder(mass, mu, s0, u, i, obj_type_id, r, h));
                }


            }

        System.out.println("Press 1 if you want to consider friction for this object");
        double angle= scn.nextInt();
        obj.add(new Wedge(angle));
       
        return obj;
    }

    
}
