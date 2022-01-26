package service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Service {
	
	
	public void webPageReading(String url) throws MalformedURLException
	{
		URL webUrl=new URL(url);
		try {
			Scanner sc=new Scanner(webUrl.openStream());
			StringBuffer sb=new StringBuffer();
			while(sc.hasNext())
			{
				sb.append(sc.next());
				System.out.println(sc.next());
				
			}
			String content=sb.toString();
			content=content.replaceAll("<[^>]*>", "");
			System.out.println("Content of the web page:-"+ content);
			
		} catch (IOException e) {
						e.printStackTrace();
		}
		
		
		
		
	}

}
