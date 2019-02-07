
public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=3;
		int lns=4;
		int k =1;
		for(int i=0;i<lns;i++,sp--,k++)
		{ 
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)
			{
				if(j==0||j==((i*2)+1)-1)
					System.out.print(k);
				else
				System.out.print(" ");
			}
			System.out.println("");
			
		}

	}
}
