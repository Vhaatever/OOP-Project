package Sys;
import java.util.ArrayList;

import Describe.*;
import Objt.Objects;
public class PulleySys extends Systems implements Force_Y, Pulley {

    public void simulate(ArrayList<Objects> obj, float slice, int delta) {
    }

    @Override
    public void describe_constraints() {
        System.out.println("The system can only move in y axis");
        System.out.println("The system can be provided with the initial velocity");
               
    }

    @Override
    public void describe_reference() {
        System.out.println("You are providing the distance of the two objects which tacitly provides the string length. \n This string length becomes a constraint");        
    }

}
