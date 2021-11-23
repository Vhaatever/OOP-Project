package Input;
import Objt.*;


import java.util.*;


public abstract class Input {
  static void entry_object(ArrayList<Object> obj,int obj_type_id, double mass, double mu, double[] s0, double[] u, int i)
  {
    Scanner scn= new Scanner(System.in);
    double l;
    double b;
    switch(obj_type_id)
        {             
            case 1:
            {                  
                System.out.println("Enter the length of the object");
                l=scn.nextDouble();
                System.out.println("Enter the width of the object");
                b=scn.nextDouble();
                obj.add(new Solid_Block(mass, mu, s0, u, i, obj_type_id, l, b));
                break;
               
            }
            case 2:
            {
                System.out.println("Enter the radius of the object");
                double r=scn.nextDouble();
                obj.add(new Sphere(mass, mu, s0, u, i, obj_type_id,r));
                break;
            }
            case 3:
            {
                System.out.println("Enter the radius of the object");
                double r=scn.nextDouble();
                System.out.println("Enter the height of the object");
                double h=scn.nextDouble();
                obj.add(new Cylinder(mass, mu, s0, u, i, obj_type_id, r, h));
                break;
            }


        }
        scn.close();
  }  
      
}        

