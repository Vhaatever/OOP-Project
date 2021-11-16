package Objt;

abstract class NonRollable extends Objects {
    NonRollable(double mass, double mu, double[] s0, double[] u, int objectID,  int objectTypeID, double point_collision)
    {
        super(mass, mu, s0,u,objectID, objectTypeID, point_collision);
    }

}
