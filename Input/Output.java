package Input;

public class Output {
    String sys1= "\n 1 for Collision";
    String sys2= "\n 2 for Wedge";
    String sys3= "\n 3 for Spring Attached";
    String sys4= "\n 4 for Spring Free";
    String sys5= "\n 5 for Collision+";
    String describe_project="This project is an attempt at doremifasoletino";
    String choosing_instructions="For chooing, press the following";
    public void start_screen()
    {
        System.out.println("Menu");
        System.out.println();
        System.out.println(describe_project);
        System.out.println();
    }

    public void describe_systems()
    {
        System.out.println("Collison is a system, where 1 or obejcts are given some initial velocity and their interaction (if it occcurs) is seen in terms of elastic collision.");
        System.out.println("Wedge is a system where an object is placed on a wedge which has some inclination. The coordinate of the objects are then mapped");
        System.out.println(sys3);
        System.out.println(sys4);
        System.out.println(sys5);
    }

    public void legend_system()
    {
        System.out.println(choosing_instructions);
        System.out.println(sys1);
        System.out.println(sys2);
        System.out.println(sys3);
        System.out.println(sys4);
        System.out.println(sys5);
    }
}
