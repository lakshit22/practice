package practise.mock;

import java.io.*;

public class MySerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Lakshit", 24);
        FileOutputStream out = new FileOutputStream("student.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(out);
        outputStream.writeObject(student);

        FileInputStream inputStream = new FileInputStream("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Student std = (Student) objectInputStream.readObject();

        System.out.println(std.getAge() + " " + std.getName());
        System.out.println(std.hashCode());
        System.out.println(student.hashCode());
    }
}
