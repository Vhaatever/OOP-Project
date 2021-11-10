package Sys;

import Describe.*;

public class Collision extends Systems implements Friction, Force_X, Ground {
    public void describe_constraints()
    {
        System.out.println("The mass has to be the same for the objects (assumption in our system). The unit is kg");
        System.out.println("The velocity is with a direction. The unit is m/s");
        System.out.println("The initial position is with respect to the reference.");
        System.out.println("You are allowed to take friction coefficient arbitraily non negative");
        System.out.println("Initial acceleration is assumed to be zero");
    }
    public void describe_reference()
    {
        System.out.println("The 1D coordinate system will be follwoed with the package in the same refernece frame");
    }
}
