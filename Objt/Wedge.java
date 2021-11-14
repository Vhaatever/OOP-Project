package Objt;

public class Wedge extends Environment {
    private double angle;

    public Wedge(double angle)
{
    this.angle= angle;
}
    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Wedge [angle=" + angle + "]";
    }

    public static void describe_constraints()
    {
        System.out.println("The wedge must have an angle of inclination greater than zero and less than 90 degrees.");
    }
}
