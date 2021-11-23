package Sys;

import java.util.ArrayList;

import Describe.*;
import Objt.Objects;
import Objt.Spring;

public class Spring_Attached extends Systems implements  Spring_Force, Ground  {
	@Override
	public void update_acc_X(Objects obj, Spring sp,double slice) {
		double[] a = new double[2];
		a[0]=-1*obj.getS0()[0]*Math.cos(find_omega(sp.getK(), obj.getMass())*slice*Math.PI/180);
		obj.setA(a);	
	}
    @Override
    public void object_distance(ArrayList<Objects> obj) {
        // TODO Auto-generated method stub
        
    }
    
	public void describe_constraints()
	{
		System.out.println("Friction is not considered. \n There is no restriction on the kind of object you choose\n"+
"The initial placement of object is assumed to be such, that the object initially placed will be compressing the spring by a distance X_0\n"+
"Everything happens on horizontal plane"+"\n the object is attached to the spring");
	}

	public void describe_reference()
	{
		System.out.println("The initial placement of object is assumed to be such, that the object initially placebe compressing with a maximum ompression\n The changes will be shown as cartesian coordinates. ");
		System.out.println("The initial coordinates will be zero along Y direction");
		System.out.println("There will be compression if intial coordinate negative. There will be stretching if the intial coordinate positive");
	}

	public void simulate(ArrayList<Object> obj, double slice, int delta) {
		Objects ob= (Objects) obj.get(0);
		Spring sp= (Spring) obj.get(1);
		boolean toggle=false;

		if(!toggle)
		{
			for(int i=1; i<delta+1; i++)
			{
				update_acc_X(ob, sp, slice);
                update_distance_harm(ob, sp, slice);
                update_velocity_harm(ob, sp, slice);
				System.out.println(ob.toString());
			}
			

		}	
	}

	@Override
	public double find_omega(double k, double m) {
		return Math.sqrt(k/m);		
	}
	@Override
	public void update_distance_harm(Objects ob, Spring sp, double k) {
		double[] s = new double[2];
		s[0]=-ob.getS0()[0]*Math.cos(find_omega(sp.getK(), ob.getMass())*k*Math.PI/180);
		ob.setS(s);	
	}
	@Override
	public void update_velocity_harm(Objects ob, Spring sp, double k) {
		double[] v = new double[2];
		v[0]=-1*ob.getS0()[0]*Math.sin(find_omega(sp.getK(), ob.getMass())*k*Math.PI/180);
		ob.setV(v);	
	}



}
