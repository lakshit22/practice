package practise;

public class ConstructorCalling {
    private String name;
    private String password;

    public ConstructorCalling(){
        System.out.println("Calling no-arg constructor");
    }

    public ConstructorCalling(String name){
        this("lakshit","mittal");
        this.name = name;
        System.out.println("Calling name constructor");
    }

    public ConstructorCalling(String password,String name){
        this();
        this.password = password;
        this.name = name;
        System.out.println("Calling name and password constructor");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
