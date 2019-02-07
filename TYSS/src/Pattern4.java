
public class Pattern4 {
	public static void main(String[] args) {
		int lns=5;
		int k=5;
		for(int i=0;i<lns;i++)
		{
			for (int j=0;j<lns;j++)
			{
				if(i==j||i+j==lns-1)
				{
					System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			k--;
			System.out.println("");
		}
	}

}
