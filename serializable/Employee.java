package practise.serializable;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password;

    public Employee(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String toString(){
        return this.name + Integer.parseInt(String.valueOf(this.age)) + this.password;
    }
}
