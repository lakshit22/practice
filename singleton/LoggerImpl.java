package practise.singleton;

public class LoggerImpl {
    public static void main(String[] args){
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("User Created");
        log2.log("User Deleted");

        System.out.println(log1 == log2);
    }
}
