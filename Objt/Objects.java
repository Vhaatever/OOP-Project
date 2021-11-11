package Objt;

import java.util.Arrays;

public class Objects {  
    private float mass;
    private float mu=0;   //friction coeff
    private float[] s0= new float[2];
    private float[] s= {0,0};
    private float[] u= new float[2];
	private float[] v= {0,0};
    private int ObjectID;
    private int ObjectTypeID;
    private float[] a= {0,0};
	private float point_collision;

    public Objects(float mass, float mu, float[] s0, float[] u, int objectID, int objectTypeID, float point_collision) {
        this.mass = mass;
        this.mu = mu;
        this.s0 = s0;
        this.u= u;
		this.s= s0; 
		this.v=u;
        this.ObjectID = objectID;
        this.ObjectTypeID = objectTypeID;
		this.point_collision=point_collision;
    }

	public float getPoint_collision() {
		return point_collision;
	}

	public void setPoint_collision(float point_collision) {
		this.point_collision = point_collision;
	}

	public float getMass() {
		return this.mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}

	public float getMu() {
		return this.mu;
	}

	public void setMu(float mu) {
		this.mu = mu;
	}

	public float[] getS0() {
		return this.s0;
	}

	public void setS0(float[] s0) {
		this.s0= s0;
	}

	public float[] getS() {
		return this.s;
	}

	public void setS(float[] s) {
		this.s=s;
	}

	public float[] getU() {
		return this.u;
	}

	public void setU(float[] u) {
		this.u=u;
	}

	public float[] getV() {
		return this.v;
	}

	public void setV(float[] v) {
		this.v= v;
	}

	public int getObjectID() {
		return this.ObjectID;
	}

	public void setObjectID(int ObjectID) {
		this.ObjectID = ObjectID;
	}

	public int getObjectTypeID() {
		return this.ObjectTypeID;
	}

	public void setObjectTypeID(int ObjectTypeID) {
		this.ObjectTypeID = ObjectTypeID;
	}

	public float[] getA() {
		return this.a;
	}

	public void setA(float[] a) {
		this.a=a;
	}

	@Override
	public String toString() {
		return "Objects [ObjectID=" + ObjectID + ", ObjectTypeID=" + ObjectTypeID + ", a=" + Arrays.toString(a)
				+ ", mass=" + mass + ", mu=" + mu + ", point_collision=" + point_collision + ", s=" + Arrays.toString(s)
				+ ", s0=" + Arrays.toString(s0) + ", u=" + Arrays.toString(u) + ", v=" + Arrays.toString(v) + "]";
	}


}
