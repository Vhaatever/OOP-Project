package Sys;

import java.util.ArrayList;
import Describe.*;
import Objt.*;

public class Collision extends Systems implements Friction, Force_X, Ground {
    public void describe_constraints()
    {
        System.out.println("The mass has to be the same for the objects (assumption in our system). The unit is kg");
        System.out.println("The velocity is with a direction. The unit is m/s");
        System.out.println("The initial position is with respect to the reference.");
        System.out.println("You are allowed to take friction coefficient arbitraily non negative");
        System.out.println("Initial acceleration is assumed to be zero");
    }
    public float getSlice() {
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
    
    static boolean is_Valid(Objects obj1, Objects obj2)
    {
    float cond1 = obj2.getS0()[0]-obj2.getPoint_collision()-obj1.getS0()[0]-obj1.getPoint_collision();
    float cond2 = obj1.getS0()[0]-obj1.getPoint_collision()-obj2.getS0()[0]-obj2.getPoint_collision();
    if(cond2 < 0 || cond1 < 0)
        return true;
    else
        return false;
    }

    public static void simulate(ArrayList<Objects> obj, float slice)
    {
    int n= obj.size();
    Collision.slice=slice;
    boolean toggle= true;
    check:
    {
        for(int i=1; i<=n ; i++)
        {
            for(int j=1; j<=n; j++)
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
                }
            }
        }
    }

    if(toggle)
    {
        
    }
   


    }


}
