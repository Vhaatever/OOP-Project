package Objt;

abstract class Rollable extends Objects{
   Rollable(double mass, double mu, double[] s0, double[] u, int objectID, int objectTypeID, double point_collision)
   {
       super(mass, mu, s0, u, objectID, objectTypeID, point_collision);
   }
   public double getK_gyration() {
    return K_gyration;
}
public void setK_gyration(double k_gyration) {
    this.K_gyration = k_gyration;
}
private double K_gyration=0;

}
