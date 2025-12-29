package practise.singleton;

public class Logger {
    private static volatile Logger logger;

    private Logger(){
        System.out.println("Connecting to Log File");
    }

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message){
        System.out.println("LOG:" + message);
    }
}
