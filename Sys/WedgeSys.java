package Sys;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import Describe.*;
import Objt.Objects;
import Objt.Wedge;
public class WedgeSys extends Systems implements Force_X, Force_Y, Friction, Slope{

	private static final double TOLERANCE = 0.05;
	private double friction;
	@Override
	public void update_acc_X(Objects obj) {
		// TODO Auto-generated method stub
		
	}

    public double getFriction() {
		return friction;
	}

	public void setFriction(double friction) {
		this.friction = friction;
	}

	public void describe_constraints()
	{
		System.out.println("You can only choose one object and a wedge for now \n There is no restriction on the kind of object you choose\n"+
"The initial placement of object is assumed to be such, that the object initially placed will be touching the slope \n you can input the angle of inclination");
	}

	public void describe_reference()
	{
		System.out.println("The initial placement of object is assumed to be such, that the object initially placed will be touching the slope\n The changes will be shown as cartesian coordinates. ");
		System.out.println("The initial coordinates will be zero along both X and Y direction");
		System.out.println("The initial velocity will be along the wedge. Positive velocity means up the slope. Negative means down the slope");
	}

	public void simulate(ArrayList<Object> obj, double slice, int delta) {
		Objects ob= (Objects) obj.get(0);
		Wedge wd= (Wedge) obj.get(1);
		System.out.println("Enter the velocity.Positive velocity means up the slope. Negative means down the slope");
		Scanner scn= new Scanner(System.in);
		Double u= scn.nextDouble();
		boolean toggle=false;
		if(ob.getMu()>=Math.tan(wd.getAngle())&&ob.getMu()!=0)
		{
			System.out.println("Object doesnt move. Friction works");
			toggle=true;
		}
		update_vel_init(ob, u, wd.getAngle());

		if(!toggle)
		{
			for(int i=1; i<delta+1; i++)
			{
				check_friction(ob,wd);
				update_acc(ob, wd, friction);
                update_distance(ob, slice);
                update_velocity(ob, slice);
				System.out.println(ob.toString());
			}
			

		}
		scn.close();	
		this.check_friction(ob,wd);
	}

	@Override
	public void update_vel_init(Objects obj, Double u, Double k) {
		double uArray[]= {(double)(-Math.cos(k)*u),(double)(Math.sin(k)*u)};
		obj.setU(uArray);
	}

	@Override
	public void check_friction(Objects obj, Wedge wedge) {
		if(obj.getV()[0]<TOLERANCE&&obj.getV()[1]<TOLERANCE)
		{
			this.setFriction(obj.getMass()*G*Math.sin(wedge.getAngle()));
		}
		else{
			this.setFriction(obj.getMass()*obj.getMu()*G*Math.cos(wedge.getAngle()));
		}
	}



	@Override
	public void check_friction(Objects obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_acc(Objects ob, Wedge wd, double friction) {
		double a1=(double)(ob.getMass()*G*Math.cos(wd.getAngle())-ob.getMu()*ob.getMass()*G*Math.sin(wd.getAngle()));
		double a2=(double)(G-G*Math.cos(wd.getAngle())-Math.sin(friction));	
		double[] acc= {a1,a2};
		ob.setA(acc);
	}
}
