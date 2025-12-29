package practise.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    private static final Long serialVersionUID = 1L;

    private String name;
    private int age;
    private String password;

    public Employee() {}

    public Employee(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(name);
        objectOutput.writeInt(age);
        objectOutput.writeUTF(password);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        name = objectInput.readUTF();
        age = objectInput.readInt();
        password = objectInput.readUTF();
    }

    private String encrypt(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    private String decrypt(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
