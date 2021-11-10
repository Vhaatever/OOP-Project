package Objt;

public class Solid_Block extends NonRollable {
    private float length;
    private float breadth;
    Solid_Block(float mass, float mu, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a, float length,float breadth)
    {
        super(mass, mu, s0, s, u, v, objectID, objectTypeID, a);
        this.setLength(length);
        this.setBreadth(breadth);
    }
    public float getBreadth() {
        return breadth;
    }
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
}
