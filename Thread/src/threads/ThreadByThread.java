package threads;

public class ThreadByThread extends Thread {
	
	private int time;

	public ThreadByThread(String name,int time) {
		
		super(name);
		this.time=time;
		start();
	
	}
	@Override
	public void run()
	{
		super.run();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread());
			try {
				sleep(time);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	

}
