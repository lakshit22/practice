package practise.questions;

public class TryCatchException {
    public static int except(){
        try{
            int c = 1/0;
            throw new Exception("tu taah pari");
        }catch (Exception e){
            throw new RuntimeException("Awieee");
        }
    }

    public static void main(String[] args) {
        System.out.println(except());
    }
}
