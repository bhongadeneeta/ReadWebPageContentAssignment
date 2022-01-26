package junit;

import java.net.MalformedURLException;

import org.junit.Test;

import service.Service;

public class Junit {
	
		@Test
		public void wepPageReadingWritingTest()
		{
			Service service = new Service();
			String webUrl = "https://www.amazon.com/";
			try {
				service.webPageReading(webUrl);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


