package threads;

public  class ThreadsByRunnble implements Runnable {

	int time;
	Thread thread;
	public ThreadsByRunnble(int time,String name)
	{
		this.time=time;
		thread = new Thread(this,name);
		thread.start();
		
		}
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(time);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}