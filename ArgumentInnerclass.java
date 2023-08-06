class ArgumentInnerclass{
	public static void main(String [] args)
	{
	new Thread(new Runnable()
		{
		public void run()
		{
		for(int i=0;i<10;i++)
		{
		System.out.println("this is child thread");
		}
		}
		}
		).start();

		for(int i= 1; i<10;i++){
		System.out.println("This is main class");
		}
	}
}