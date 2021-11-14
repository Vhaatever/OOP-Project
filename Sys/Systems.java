package Sys;
import Objt.*;
public class Systems {
    
    public void update_velocity(Objects obj, float slice)
    {
        float x= obj.getV()[0]+obj.getA()[0]*slice;
        float y= obj.getV()[1]+obj.getA()[1]*slice;
        float[] v= {x,y};
        obj.setV(v);
    }

    public void update_distance(Objects obj, float slice)
    {
        float x= (float) (obj.getS()[0]+obj.getV()[0]*slice+0.5*obj.getA()[0]*slice*slice);
        float y= (float) (obj.getS()[1]+obj.getV()[1]*slice+0.5*obj.getA()[1]*slice*slice);
        float[] s= {x,y};
        obj.setS(s);
    }
}
