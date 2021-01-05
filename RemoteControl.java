// This class has methods which allows the control remote to perform acctions 

public class RemoteControl 
{
	

	private Television tele;

//	public Television getTele() {
//		return this.tele;
//	}
//
//	public void setTele(Television tele) {
//		this.tele = tele;
//	}

	public RemoteControl(Television television)
	{
		this.tele = television;
		//television = this.getTele();

	}

	public void powerBotton() 
	{
		tele.setPower();
	}

	public void channelDownButton() //decreasing the channel by 1 per time  
	{
		if(tele.getPower() == true)//given that the tele is on
		{
			int channel = tele.getChannel();
			int maxChannel = tele.getmaxChannel();
			
			if (channel ==1)
			{
				channel = maxChannel;
			}
			else 
			{
				channel = channel -1;
			}
			
			tele.setChannel(channel);
		}
	}
	
	public void channelUpButton() //increasing the channel by 1 per time
	{
		if (tele.getPower() == true)
		{
			int channel = tele.getChannel();
			int maxChannel = tele.getmaxChannel();
			
			if (channel == maxChannel) 
			{
				channel = 1;
			}
			else
			{
				channel = channel + 1;
			}
			tele.setChannel(channel);
		
		}		
	}

	public void volumeUpByHalf()  // using a for loop to increase the volume by 50%
	{
		if (tele.getPower() == true)
		{	
			for (int i = 0; i < 50; i++)
			{
				tele.volumeUp();
			}
			
		}
	}

	public void volumeDownByHalf() // using a for loop to decrease the volume by 50%
	{
		if (tele.getPower() == true)
		{
			for (int i = 0; i < 50; i++)
			{
				tele.volumeDown();
			}
		}
	}

}
