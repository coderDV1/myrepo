package mydemo;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demomain {
	static {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
	}
	private static final String LOG_FILE = "log4j.properties";

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Demomain.class);
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(LOG_FILE));
			PropertyConfigurator.configure(properties);
		} catch (Exception e) {
			log.debug(e);
		}
		log.info("Demo Maven Project");

	}

}
