package Objt;

abstract class NonRollable extends Objects {
    NonRollable(float mass, float mu, float[] s0, float[] u, int objectID,  int objectTypeID, float point_collision)
    {
        super(mass, mu, s0,u,objectID, objectTypeID, point_collision);
    }

}
