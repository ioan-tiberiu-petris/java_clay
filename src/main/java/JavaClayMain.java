import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class JavaClayMain {

    private static final Logger logger = LogManager.getLogger(JavaClayMain.class);

    public static void main(final String... args){

        logger.trace("Entering JavaClay main() ");

        logger.debug("JavaClayMain debug level");
        logger.info("JavaClayMain info level");
        logger.error("JavaClayMain error level");

    }
}
