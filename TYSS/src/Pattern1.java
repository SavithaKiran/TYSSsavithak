
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=3;
		int lns=4;
		int k =0;
		for(int i=0;i<lns;i++,sp--)
		{ 
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			k=i+1;
			for(int j=0;j<i*2+1;j++)
			{
				if(j<(i*2+1)/2)
					System.out.print(k--);
				else
				System.out.print(k++);
			}
			System.out.println("");
			
		}

	}

}
