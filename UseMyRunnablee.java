//Using Anonymous Inner class by using Runnable Interface

class UseMyRunnablee{

	public static void main(String [] args)
	{
		Runnable r=new Runnable()
		{
			public void run()
			{
			for(int i=0; i<=10; i++)
			System.out.println("This is Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();

		for(int i=0; i<=10; i++)
		{
			System.out.println("Its a Main Thread");
		}
	
	}


}