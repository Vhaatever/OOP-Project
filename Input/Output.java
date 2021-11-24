package Input;

public class Output {
    String sys1= "1 for Collision \n";
    String sys2= "2 for Wedge \n";
    String sys3= "3 for Spring Attached \n";
    String sys4= "4 for Pulley System \n";

    String Vasu;
    
    double time;
    double delta;
    double iterations;

    public double calc_iterations(double time, double delta)
    {
        this.time= time;
        this.delta= delta;
        this.iterations= time/delta; 
        return this.iterations;
    }


    String describe_project="This project is an attempt to simulate an N body physics system \n";
    String choosing_instructions="For choosing, press the following \n";
    public void start_screen()
    {
        System.out.println("Menu \n");
        System.out.println(describe_project);

    }

    public void describe_systems()
    {
        System.out.println("Collison is a system, where 1 or more obejcts are given some initial velocity and their interaction (if it occcurs) is seen in terms of elastic collision. \n");
        System.out.println("Wedge is a system where an object is placed on a wedge which has some inclination. The coordinate of the objects are then mapped over time. \n");
        System.out.println("We have an object attached to a stationary spring. The object is given some compression, and then we simulate the harmonic motion. \n");
        System.out.println("2 bodies are attached to a string and hung from a pulley. We simulate it's motion \n");
    }

    public void legend_system()
    {
        System.out.println(choosing_instructions);
        System.out.println(sys1);
        System.out.println(sys2);
        System.out.println(sys3);
        System.out.println(sys4);
    }

    public static void legend_object()
    {
    String Obj1= "1-Solid Block \n";
    String Obj2= "2-Sphere \n";
    String Obj3= "3-Cylinder \n";
    System.out.println(Obj1);
    System.out.println(Obj2);
    System.out.println(Obj3);

    }
}
