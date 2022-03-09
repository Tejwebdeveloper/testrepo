package threads;

public class Synchro {
	int bal=1000;
	synchronized void deposit(int amt)
	{
		int temp=bal;
		temp=temp+amt;
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
	}
		bal=temp;
		System.out.println("acc_bal"+bal);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Synchro s =new Synchro();
		System.out.println(s);
		new M1(s);
		new M2(s);
		
	}
	

}
