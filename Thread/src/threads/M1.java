package threads;

public class M1 extends Thread {
	Synchro s;
    M1(Synchro s)
    {
    this.s=s;
    start();
}
    

public void run()
{
	s.deposit(1500);
}
}
