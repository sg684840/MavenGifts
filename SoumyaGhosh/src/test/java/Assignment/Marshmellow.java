package Assignment;

public class Marshmellow implements Sweets {

	int n;
	double wt=0.028;
	Marshmellow(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt*n;
	}

}
