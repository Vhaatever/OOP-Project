import java.util.ArrayList;
import java.util.Scanner;
import Input.*;
import Objt.*;
public class Driver extends Output
   { public static void main(String[] args)
    {

    int N;  // no. of objects   
    int n;  // no. of iterations
    int sys_ID;
    Output op= new Output();
    op.start_screen();
    op.describe_systems();
    op.legend_system();
    Scanner scn= new Scanner(System.in);
    sys_ID=scn.nextInt();
    ArrayList<Objects> obj = new ArrayList<Objects>();
    switch(sys_ID)
    {
        
        case 1:
        {
            obj.addAll(Collision_Input.initiate());
            break;
        }
        case 2:
        {

        }
    }

    }
}


