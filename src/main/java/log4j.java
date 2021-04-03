import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class log4j {

    private  static Logger LOG =(Logger) LogManager.getLogger(log4j.class);

    public static void  main(String[] args) throws Exception{
        for(int i=0;i<1000;i++){
            logAll();
        }
    }

    public static void logAll() throws Exception {
        LOG.trace("trace level log");
        LOG.debug("debug level log");
        LOG.info("info level log");
        LOG.error("error level log");
        LOG.fatal("fatal level log");

        Thread.sleep(3000);
    }



}
