import java.io.File;
import java.io.FileInputStream;
import java.util.logging.*;

public class Log {
    static {
        try(FileInputStream in = new FileInputStream("log.config")){ //относительный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}
