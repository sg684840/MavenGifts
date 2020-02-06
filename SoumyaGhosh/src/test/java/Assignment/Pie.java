package Assignment;

public class Pie implements Sweets {

	int n;
	double wt=0.025;
	Pie(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt*n;
	}

}
