package Objt;

abstract class NonRollable extends Objects {
    NonRollable(float mass, float mu, float[] s0, float[] s, int objectID)
    {
        super(mass, mu, s0, s,objectID, objectID);
    }

}
