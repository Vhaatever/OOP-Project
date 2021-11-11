package Objt;

abstract class Rollable extends Objects{
   Rollable(float mass, float mu, float[] s0, float[] u, int objectID, int objectTypeID, float point_collision)
   {
       super(mass, mu, s0, u, objectID, objectTypeID, point_collision);
   }

@Override
public String toString() {
    return "Rollable []";
}
}
