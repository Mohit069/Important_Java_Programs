//Normal approach by implementing Runnable interface

class MyRunnable implements Runnable
{
	public void run()
	{
	for(int i=0;i<=10;i++)
	System.out.println("Child Thread");
	}

}

class UseMyRunnable
{
	public static void main(String [] args)
	{
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		t.run();
	
		for(int i=0;i<=10;i++)
		System.out.println("Main Thread");
	}
}