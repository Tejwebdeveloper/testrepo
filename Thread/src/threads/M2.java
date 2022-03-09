package threads;

public class M2 {

	Synchro s;
	M2(Synchro s){
		this.s=s;
		start();
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
	public void run()
	{
		s.deposit(1000);
	}
}
