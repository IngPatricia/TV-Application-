
public class Television
{
	// Instance variables

	
	private boolean power;
	private int channel;
	private final int maxChannel; 
	private int volume;
	
	//constructors
	/**In both constructors, power = false means off.
	 * default values for both of the constructors
	 * */
	public Television() 
	{
		this.maxChannel = 10;
		this.volume = 0;
		this.channel = 1;
		this.power = false;
	}
	
	public Television(int max)
	{
		if (max < 2)
		{
			maxChannel = 10;
		}
		else
		{
			maxChannel = max;
		}
		this.volume = 0;
		this.channel = 1;
		this.power = false;
		
	}
	
	
	
	//Get & Set methods are the instance variables are private
	
	public void setPower()
	{
		if (power)
		{
			this.power = false;
		}
		else
			{
			this.power = true;
		}
	}
	
	public boolean getPower()
	{
		return power;
	}
	
	public void setChannel(int channel)
	{
	
		if (channel >= 1 && channel <= maxChannel)
		{
			this.channel = channel;
		
		}
	}
	
	public int getChannel()
	{
		return this.channel;
	}
	
	public int getVolume()
	{
		return this.volume;
	}
	
	private void setVolume(int volume) 
	{		
		if (volume >= 0  && volume <= 100) 
		{
			this.volume = volume;
		}
		
	}
	
	public void volumeDown()
	{
	  int volume = getVolume() - 1 ; 
	  setVolume(volume);
	}
	
	
	public void volumeUp()
	{
	  int volume = getVolume() + 1 ;
	  setVolume(volume);	
	}

		
	public int getmaxChannel()
	{
		return maxChannel;	
	}

	
	public String toString() // Method overwritting in order to do what we want!! yaas!
	{
		String outPut = "[Television is: on? " ;
		
		if (getPower() == true)
		{
			outPut = outPut + "YES ";
		}
		else
		{
			outPut  = outPut + " NO ";
		}
		
		outPut  = outPut + "CHANNEL: " + getChannel() + "/" + getmaxChannel() + " VOLUME: " + getVolume() + "% ";
		if (getVolume() == 0)
		{
			outPut = outPut + "(muted) ]";
		}
		else 
		{
			outPut = outPut + "]";
		}
		
		return outPut;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}