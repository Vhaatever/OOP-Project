package Sys;
import java.util.ArrayList;

import Describe.*;
import Objt.Objects;
public class PulleySys extends Systems implements Force_Y, Pulley {
    
    private static double slice;
    private static double string_length;

    public void simulate(ArrayList<Objects> obj, double slice, int num)
    {
    int n= obj.size();
    PulleySys.slice=slice;
    boolean toggle= true;
    for(int i=0; i<n ; i++)
        {

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
                    }
                }
                update_distance(obj.get(i), slice);
                update_velocity(obj.get(i), slice);
            } 

        }}
               
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

}
