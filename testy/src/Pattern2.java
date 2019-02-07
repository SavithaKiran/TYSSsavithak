
public class Pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=3;
		int lns=4;
		char ch = 'A';
		for(int i=0;i<lns;i++,sp--)
		{ 
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)
			{
				System.out.print(ch);
				
			}
			ch  = (char) (ch+2);
			System.out.println("");
			
		}

	}
}


