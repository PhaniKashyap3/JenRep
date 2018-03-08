package MavenSample.Jenkins.MavenSample.Jenkins;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;

public class Sample {
	public static void main(String[] args) {

		Logger logger = Logger.getLogger("II");
		BasicConfigurator.configure();
		logger.info("This is my first log4j's statement");
		logger.info("This is my first log4j's statement");

		// TODO Auto-generated method stub
		System.out.println("Heyy!!Hellooo");
		
	}

}
