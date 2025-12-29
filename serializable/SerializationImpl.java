package practise.serializable;

import java.io.*;

public class SerializationImpl {
    public static void main(String[] args){
        ObjectOutputStream out;
        Employee firstEmp;
        try {
            out = new ObjectOutputStream(new FileOutputStream("emp.data"));
            firstEmp = new Employee("Lakshit",24,"Mittal");
            out.writeObject(firstEmp);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ObjectInputStream in =
                null;
        Employee emp;
        try {
            in = new ObjectInputStream(new FileInputStream("emp.data"));
            emp = (Employee) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(firstEmp.toString());
        System.out.println(emp.toString());
    }
}
