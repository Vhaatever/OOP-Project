package Sys;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import Describe.*;
import Objt.Objects;
import Objt.Wedge;
public class WedgeSys extends Systems implements Force_X, Friction, Slope{

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
		System.out.println("You can only choose one object and a wedge for now \n");
		System.out.println("There is no restriction on the kind of object you choose\n"); 
		System.out.println("The initial placement of object is assumed to be such, that the object initially placed will be touching the slope \n"); 
		System.out.println("you can input the angle of inclination \n");
	}

	public void describe_reference()
	{
		System.out.println("The initial placement of object is assumed to be such, that the object initially placed will be touching the slope \n");
		System.out.println("The changes will be shown as cartesian coordinates.\n");
		System.out.println("The initial coordinates will be zero along both X and Y direction \n");
		System.out.println("The initial velocity will be along the wedge. Positive velocity means up the slope. Negative means down the slope \n");
	}

	public void simulate(ArrayList<Object> obj, double slice, int delta) {
		Objects ob= (Objects) obj.get(0);
		Wedge wd= (Wedge) obj.get(1);
		System.out.println("Enter the velocity.Positive velocity means down the slope. Negative means up the slope \n");
		Scanner scn= new Scanner(System.in);
		Double u= scn.nextDouble();
		boolean toggle=false;
		if(ob.getMu()>=Math.tan(wd.getAngle())&&ob.getMu()!=0)
		{
			System.out.println("\n ********** \n ********** Object doesnt move. Friction works \n ********** \n ********** \n");
			toggle=true;
		}
		update_vel_init(ob, u, wd.getAngle());

		if(!toggle)
		{
			ob.setV(ob.getU());
			for(int i=1; i<delta+1; i++)
			{
				check_friction(ob,wd);
				update_acc(ob, wd, friction);
                update_distance(ob, slice);
				
                update_velocity(ob, slice);
				
				System.out.println("Time-"+slice*i);
				System.out.println(ob.toString());
			}
			

		}
		scn.close();	
	}

	@Override
	public void update_vel_init(Objects obj, Double u, Double k) {
		double uArray[]= {(Math.cos(k)*u),(Math.sin(k)*u)};
		obj.setU(uArray);
	}

	@Override
	public void check_friction(Objects obj, Wedge wedge) {
		if(obj.getV()[0]!=0&&obj.getV()[1]!=0)
		{
			this.setFriction(obj.getMass()*obj.getMu()*G*Math.cos(wedge.getAngle()));
		}
		else{
			this.setFriction(obj.getMass()*G*Math.sin(wedge.getAngle()));
		}
	}



	@Override
	public void check_friction(Objects obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_acc(Objects ob, Wedge wd, double friction) {
		double MG = ob.getMass()*G;
		double Normal = MG*Math.cos(wd.getAngle());
		double SIN = Math.sin(wd.getAngle());
		double COS = Math.cos(wd.getAngle());
		double fx = friction*COS;
		double fy = friction*SIN;
		double ax= Normal*SIN - fx;
		double ay= MG - Normal*COS - fy;	
		double[] acc= {ax,ay};
		ob.setA(acc);
	
	}}

