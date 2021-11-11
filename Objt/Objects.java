package Objt;

public class Objects {  
    private float mass;
    private float mu=0;   //friction coeff
    private float[] s0= new float[2];
    private float[] s= new float[2];
    private float[] u= new float[2];
	private float[] v= new float[2];
    private int ObjectID;
    private int ObjectTypeID;
    private float[] a= new float[2];

    public Objects(float mass, float mu, float[] s0, float[] s, int objectID, int objectTypeID) {
        this.mass = mass;
        this.mu = mu;
        this.s0 = s0;
        this.s = s;

        this.ObjectID = objectID;
        this.ObjectTypeID = objectTypeID;
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

}
