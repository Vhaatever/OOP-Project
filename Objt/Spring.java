package Objt;

public class Spring extends Environment {
    double k;

    public Spring(double k2) {
        this.k=k2;
    }

    public double getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Spring [k=" + k + "]";
    }
    public static void describe_constraints()
    {
        System.out.println("The current implementation considers spring to be in the horizontal system.");
        System.out.println("The spring is currently unstretched.");
    }
}
