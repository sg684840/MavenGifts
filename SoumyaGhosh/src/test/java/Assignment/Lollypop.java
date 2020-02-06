package Assignment;

public class Lollypop implements Sweets {

	int n;
	double wt=0.030;
	Lollypop(int n)
	{
		this.n=n;
	}
	public double weights(int n)
	{
		return wt*n;
	}

}
