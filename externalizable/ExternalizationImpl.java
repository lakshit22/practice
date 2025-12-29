package practise.externalizable;

import java.io.*;

public class ExternalizationImpl {
    public static void main(String[] args){
        ObjectOutputStream out;

        try{
            out = new ObjectOutputStream(new FileOutputStream("employee.data"));
            out.writeObject(new Employee("Lakshit",24,"Mittal"));
            out.close();
        }catch(Exception e){
            throw new RuntimeException("Phaik dia Exception sala");
        }

        ObjectInputStream in;
        Employee emp;
        try{
            in = new ObjectInputStream(new FileInputStream("employee.data"));
            emp = (Employee) in.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(emp);
    }
}
