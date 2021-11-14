package Sys;

import java.util.ArrayList;
import Describe.*;
import Objt.*;
public class Collision extends Systems implements Friction, Force_X, Ground {
    private static final float TOLERANCE = (float) 0.05;
    private static final double G = 9.8;

    public void update_acc_X(Objects obj)
    {
        obj.getA()[0]=(float) (Integer.signum((int) obj.getV()[0])*obj.getMu()*G);
    }
    public static void update_vel_collision(Objects obj1, Objects obj2)
    {
        float[] temp= obj1.getV();
        obj1.setV(obj2.getV());
        obj2.setV(temp);
    }

    public void describe_constraints()
    {
        System.out.println("The mass has to be the same for the objects (assumption in our system). The unit is kg");
        System.out.println("The velocity is with a direction. The unit is m/s");
        System.out.println("The initial position is with respect to the reference.");
        System.out.println("You are allowed to take friction coefficient arbitraily non negative");
        System.out.println("Initial acceleration is assumed to be zero");
    }

   boolean check_collision(Objects obj1, Objects obj2)
{
    float cond1 = obj2.getS0()[0]+obj2.getPoint_collision()-obj1.getS0()[0]+obj1.getPoint_collision();
    float cond2 = obj1.getS0()[0]+obj1.getPoint_collision()-obj2.getS0()[0]+obj2.getPoint_collision();
    if(cond2 < TOLERANCE || cond1 < TOLERANCE) 
        return true;
    else
        return false;
    

}    public float getSlice() {
        return slice;
    }
    public void setSlice(float slice) {
        Collision.slice = slice;
    }
    public void describe_reference()
    {
        System.out.println("The 1D coordinate system will be follwoed with the package in the same refernece frame");
    }

    private static float slice;
    
   boolean is_Valid(Objects obj1, Objects obj2)
    {
        float cond1 = obj2.getS0()[0]+obj2.getPoint_collision()-obj1.getS0()[0]+obj1.getPoint_collision();
        float cond2 = obj1.getS0()[0]+obj1.getPoint_collision()-obj2.getS0()[0]+obj2.getPoint_collision();
        if(cond2 < 0 || cond1 < 0)
        return true;
    else
        return false;
    }

    public void simulate(ArrayList<Objects> obj, float slice, int num)
    {
    int n= obj.size();
    Collision.slice=slice;
    boolean toggle= true;
    check:
    {
        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i!=j)
                {
                    Objects obj1=obj.get(0);
                    Objects obj2=obj.get(1);
                    if(!is_Valid(obj1, obj2))
                    {
                       toggle= false;
                       System.out.println( "System input invalid. Object"+i+" and Object " +j+" has intersecting initial placement");
                       break check;
                    }
                    else{
                     
                    }
                }
            }
        }
    }

    if(toggle)
    {
        System.out.println(slice);
        for(int k=1; k<num+1; k++)
        {
            for(int i=0; i<n ; i++)
            {
                for(int j=0; j<n; j++)
                {
                    if(i!=j)
                    {
                        Objects obj1=obj.get(0);
                        Objects obj2=obj.get(1);
                        if(check_collision(obj1, obj2))
                        {
                            update_vel_collision(obj1, obj2);  
                        }
                    }
                }
               

                check_friction(obj.get(i));
                update_distance(obj.get(i), slice);
                update_velocity(obj.get(i), slice);
            } 

            object_distance(obj);
        }
               
    }
 
 

    }
   public void check_friction(Objects obj) {
        
        if(obj.getV()[0]>0)
        {
            update_acc_X(obj);
        }
    }

public void object_distance(ArrayList<Objects> obj) {
    for(int i=0; i<obj.size();i++)
    {
        System.out.println(obj.get(i));
        System.out.println(i+"th iteration");
    }
}
@Override
public void check_friction(Objects obj, Wedge wedge) {
	// TODO Auto-generated method stub
	
}



}
