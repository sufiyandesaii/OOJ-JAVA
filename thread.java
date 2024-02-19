class BMSThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("BMS College of Engineering");
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}	
	}
}

class CSEThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


public class ThreadExample
{
	public static void main(String[] args)
	{
		BMSThread bmsThread=new BMSThread();
		bmsThread.start();
	
		CSEThread cseThread=new CSEThread();
		cseThread.start();
	}
}