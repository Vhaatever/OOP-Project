package Objt;

abstract class Rollable extends Objects{
   Rollable(float mass, float mu, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a)
   {
       super(mass, mu, s0, s, u, v, objectID, objectTypeID, a);
   }

 Rollable(float mass, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a)
{
    super(mass, s0, s, u, v, objectID, objectTypeID, a);
    }

}
