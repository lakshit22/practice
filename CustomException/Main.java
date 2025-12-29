package practise.CustomException;

public class Main {
    public static void main(String[] args) throws ExceptionByLakshit {
        try{
            int a = 10/0;
        }catch(Exception e){e.getCause();
            throw new ExceptionByLakshit("Custom Exception by Lakshit " + e);
        }
    }
}
