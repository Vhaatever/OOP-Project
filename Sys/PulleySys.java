package Sys;
import java.util.ArrayList;

import Describe.*;
import Objt.Objects;
public class PulleySys extends Systems implements Force_Y, Pulley {
    
    private static final double TOLERANCE = 0.05;
    private static double slice;
    private static double string_length;
    private boolean b;
    private boolean c;

    public void simulate(ArrayList<Objects> obj, double slice, int num)
    {
    int n= obj.size();
    PulleySys.setSlice(slice);
       
    setString_length(getSlice(obj));  
    update_acc_Y(obj); 
    for(int j=1; j<=num; j++)
    {
        b = getSlice(obj)-getString_length()<TOLERANCE;
        c = getString_length()-getSlice(obj)<TOLERANCE;
        System.out.println("Time-"+slice*j);

     
            for(int i=0; i<n ; i++)  
            {
                if((b||c)&&(obj.get(i).getS()[1]>0)&&(obj.get(i).getS()[1]<getString_length()))
                {
            update_distance(obj.get(i), slice);
            update_velocity(obj.get(i), slice);
            System.out.println(obj.get(i).toString());}
            else
        {
            System.out.println("String Ended");
        }
            }
        }
        
        
    }



 
    public static double getString_length() {
        return string_length;
    }

    public static void setString_length(double string_length) {
        PulleySys.string_length = string_length;
    }

    public static double getSlice() {
        return slice;
    }

    public static void setSlice(double slice) {
        PulleySys.slice = slice;
    }

    @Override
    public void describe_constraints() {
        System.out.println("The system can only move in y axis");
        System.out.println("The system can be provided with the initial velocity");
               
    }

    @Override
    public void describe_reference() {
        System.out.println("You are providing the distance of the two objects which tacitly provides the string length. \n This string length becomes a constraint");        
        System.out.println("You are providing the distance of the object from the pulley. The values below the pulley is the postive coordinate");
     }

     public double getSlice(ArrayList<Objects> obj)
     {
         double l1= obj.get(0).getS()[1];
         double l2= obj.get(1).getS()[1];
         return l1+l2;
     }

    @Override
    public void update_acc_Y(ArrayList<Objects> obj) {
        double m1= obj.get(0).getMass();
        double m2= obj.get(1).getMass();

        double[] a1={0, (m1-m2)/(m1+m2)*G};
        obj.get(0).setA(a1);

        double[] a2={0, (m2-m1)/(m1+m2)*G};
        obj.get(1).setA(a2);
    }
}
