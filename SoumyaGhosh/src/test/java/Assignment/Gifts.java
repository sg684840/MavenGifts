package Assignment;

import java.util.*;
public class Gifts {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int pie,lollypop,marsh,m_choco,d_choco;
		System.out.println("\n....................NEW YEARS GIFT..................");
		System.out.print("\nEnter the number of gifts: ");
		int gfts = sc.nextInt();
		double[] weight = new double[gfts];
		double[] ar = new double[gfts];
		double[] ar2 = new double[gfts];
		double sum=0,s=0;
		int i;
		for(i=0;i<gfts;i++)
		{
			System.out.print("\nEnter number of pie for gift " + (i+1) +": ");
			pie=sc.nextInt();
			System.out.print("Enter number of laddoo for gift " + (1+i) +": ");
			lollypop=sc.nextInt();
			System.out.print("Enter number of gulab jamun for gift " + (1+i) +": ");
			marsh=sc.nextInt();
			System.out.print("Enter number of milk chocolates for gift " + (i+1) +": ");
			m_choco=sc.nextInt();
			System.out.print("Enter number of dark chocolates for gift " + (i+1) +": ");
			d_choco=sc.nextInt();

			Sweets obj1 = new Pie(pie);
			Sweets obj2 = new Lollypop(lollypop);
			Sweets obj3 = new Marshmellow(marsh);
			Choco obj4 = new Milk_Choco(m_choco);
			Choco obj5 = new Dark_Choco(d_choco);

			sum = obj1.weights(pie) + obj2.weights(lollypop) + obj3.weights(marsh) + obj4.weight(m_choco) + obj5.weight(d_choco);
			System.out.println("The weight of gift "+i+" is "+sum);
			weight[i]=sum;
			ar2[i]=sum;
			ar[i]=pie+lollypop+marsh+m_choco+d_choco;
			System.out.println("Total number of candies : " +ar[i]);
			s=s+weight[i];
		}
		System.out.println("\nTotal weight of the gifts are : "+s); 
		
		weight=sort(weight);
		ar=sort(ar);
		
		System.out.print("\nWeights of gifts in sorted order(ascending) : ");
		for(i=0;i<gfts;i++)
			System.out.print(weight[i]+" ");
		
		double mid=weight[(int)(gfts/2)];
		
		System.out.println("\n\n\n......Gifts are arranged on basis of weights....\n");
		System.out.println("....gifts with weight below "+mid+"gms will be added with 10 candies");
		System.out.println("....gifts with weight above "+mid+"gms will be added with 5 candies\n");
		for(i=0;i<gfts;i++)
		{
			if(ar2[i]<mid)
				System.out.println("Total no of items are...."+ar[i]+ " after 10 candies are added... "+(ar[i]+10));
			else
				System.out.println("Total no of items are...."+ar[i]+" after 5 candies are added... "+(ar[i]+5));
		}
			
	}
	public static double[] sort(double arr[])
	{
		int i,j;
		double temp=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
