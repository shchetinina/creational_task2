import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;
    private static int countMsg = 0;
    private Logger(){

    }

    public static Logger getInstance(){
        return instance == null ? new Logger() : instance;
    }

    public void log(String msg){
        countMsg++;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(String.format("[" + LocalDateTime.now().format(format) + " %d] %s", countMsg, msg));
    }
}
