package Sys;
import Objt.*;
public class Systems {
    
    public void update_velocity(Objects obj, double slice)
    {
        double x= obj.getV()[0]+obj.getA()[0]*slice;
        double y= obj.getV()[1]+obj.getA()[1]*slice;
        double[] v= {x,y};
        obj.setV(v);
    }

    public void update_distance(Objects obj, double slice)
    {
        double x=  (obj.getS()[0]+obj.getV()[0]*slice+0.5*obj.getA()[0]*slice*slice);
        double y=  (obj.getS()[1]+obj.getV()[1]*slice+0.5*obj.getA()[1]*slice*slice);
        double[] s= {x,y};
        obj.setS(s);
    }
}
