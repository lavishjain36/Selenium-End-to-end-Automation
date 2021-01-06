package Bpack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {
	public static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {

		log.debug("I am debugging");

		log.info("Object is present");
		log.error("Object is not present");

		log.fatal("this is fatal");

	}

}
