package Objt;

import java.util.Arrays;

public class Objects {  
    private double mass;
    private double mu=0;   //friction coeff
    private double[] s0= new double[2];
    private double[] s= {0,0};
    private double[] u= new double[2];
	private double[] v= {0,0};
    private int ObjectID;
    private int ObjectTypeID;
    private double[] a= {0,0};
	private double point_collision;

    public Objects(double mass, double mu, double[] s0, double[] u, int objectID, int objectTypeID, double point_collision) {
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

	public double getPoint_collision() {
		return point_collision;
	}

	public void setPoint_collision(double point_collision) {
		this.point_collision = point_collision;
	}

	public double getMass() {
		return this.mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getMu() {
		return this.mu;
	}

	public void setMu(double mu) {
		this.mu = mu;
	}

	public double[] getS0() {
		return this.s0;
	}

	public void setS0(double[] s0) {
		this.s0= s0;
	}

	public double[] getS() {
		return this.s;
	}

	public void setS(double[] s) {
		this.s=s;
	}

	public double[] getU() {
		return this.u;
	}

	public void setU(double[] u) {
		this.u=u;
	}

	public double[] getV() {
		return this.v;
	}

	public void setV(double[] v) {
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

	public double[] getA() {
		return this.a;
	}

	public void setA(double[] a) {
		this.a=a;
	}

	@Override
	public String toString() {
		return "Objects [ObjectID=" + ObjectID + ", ObjectTypeID=" + ObjectTypeID + ", a=" + Arrays.toString(a)
				+ ", mass=" + mass + ", mu=" + mu + ", point_collision=" + point_collision + ", s=" + Arrays.toString(s)
				+ ", s0=" + Arrays.toString(s0) + ", u=" + Arrays.toString(u) + ", v=" + Arrays.toString(v) + "]";
	}


}
