import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.core.Logger;
public class log4j {

    private  static Logger LOG =(Logger) LogManager.getLogger(log4j.class);

    public static void main(String[] args) throws InterruptedException {



        for (int i = 1; i < 100; i++)
        {

            LOG.info("Baa, baa, black sheep,");
            LOG.info("Have you any wool?");
            LOG.info("Yes, sir, yes, sir,");
            LOG.warn(MarkerManager.getMarker("Hickory"),"Three bags full;");
            LOG.error(MarkerManager.getMarker("dickory"),"One for the master");

            Thread.sleep(300);
        }
    }




}
