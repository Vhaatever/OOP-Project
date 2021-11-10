package Objt;

abstract class NonRollable extends Objects {
    NonRollable(float mass, float mu, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a)
    {
        super(mass, mu, s0, s, u, v, objectID, objectTypeID, a);
    }
    NonRollable(float mass, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a)
    {
        super(mass, s0, s, u, v, objectID, objectTypeID, a);
    }
}
