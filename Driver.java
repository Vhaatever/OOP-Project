import java.util.Scanner;
import Objt.*;
import Input.*;;

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

    switch(sys_ID)
    {
        case 1:
        {
            Collision_Input.start();

            break;
        }
    }

    }
}


