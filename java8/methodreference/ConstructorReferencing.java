package practise.java8.methodreference;

@FunctionalInterface
interface MyConstructorReferencing {
    public Message say();
}

class Message {
    public Message(){
        System.out.println("Hello, Calling from Constructor");
    }
}

public class ConstructorReferencing {
    public static void main(String[] args) {
        MyConstructorReferencing message = Message::new;
        message.say();
    }
}
