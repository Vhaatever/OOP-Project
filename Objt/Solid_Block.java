package Objt;

public class Solid_Block extends NonRollable {
    private float length;
    private float breadth;
    public Solid_Block(float mass, float mu, float[] s0,  float[] u, int objectID, int objectTypeID,float length,float breadth)
    {
        super(mass, mu, s0, u, objectID);
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
