package Apack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	public static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("I have clicked on button");

		log.info("Button is displayed");
		log.error("Button is not displayed");

		log.fatal("Button is missing");

	}

}
