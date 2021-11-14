package Sys;

import java.util.ArrayList;

import Describe.*;
import Objt.Objects;
public class WedgeSys extends Systems implements Force_X, Force_Y, Friction, Slope{

	@Override
	public void update_acc_X(Objects obj) {
		// TODO Auto-generated method stub
		
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

	public void simulate(ArrayList<Object> obj, float slice, int delta) {


	}
}
