package account;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    return new Logger();
                }
            }
            return new Logger();
        }
        return instance;
    }
    public void log(String log){
        System.out.println(log);
    }
}
