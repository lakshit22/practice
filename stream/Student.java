package practise.stream;

public class Student implements Comparable<Student>{
    private int marks;
    private int age;
    private String city;

    public Student(){}
    public Student(int age, int marks){
        this.age = age;
        this.marks = marks;
    }

    public Student(int age, int marks, String city){
        this.age = age;
        this.marks = marks;
        this.city = city;
    }
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    @Override
//    public int compareTo(Student o) {
//        if (this.city == null && o.city == null) return 0;
//        if (this.city == null) return -1;
//        if (o.city == null) return 1;
//        return this.city.compareTo(o.city);
//    }
    @Override
    public int compareTo(Student o) {
        if (this.city == null && o.city == null) return 0;
        if (this.city == null) return -1;
        if (o.city == null) return 1;
        return this.city.compareTo(o.city);
    }
}
