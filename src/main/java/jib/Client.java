package jib;

import java.time.LocalDateTime;

import org.apache.commons.lang3.RandomStringUtils;

public class Client{

	public static void main(String[] args) throws InterruptedException{		
		int sleep = Integer.parseInt( System.getenv("sleep")!=null ? System.getenv("sleep") : "5000" );
		
		while(Boolean.TRUE){
			Thread.sleep(sleep);
			System.out.println( LocalDateTime.now() + ", " + RandomStringUtils.randomAlphabetic(10) );			
		}
	}//main
	
}//class
