package practise.constant;

import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.invoke.MethodHandles;
import java.util.Optional;

public class NominalDescriptorDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        ClassDesc classDesc = ClassDesc.of("java.lang.String");
        System.out.println("Class Descriptor: " + classDesc);

        Class<?> clazz = (Class<?>) classDesc.resolveConstantDesc(MethodHandles.lookup());
        System.out.println("\nResolved Class: " + clazz);

        String text = "Hello Java";
        Optional<? extends ConstantDesc> optionalDesc = text.describeConstable();
        System.out.println("\nConstable Descriptor: ");
        optionalDesc.ifPresent(System.out::println);

        ConstantDesc stringDesc = optionalDesc.get();
        Object resolvedValue = stringDesc.resolveConstantDesc(MethodHandles.lookup());
        System.out.println("\nResolved Value:");
        System.out.println(resolvedValue);

        MethodTypeDesc methodTypeDesc = MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)I");
        System.out.println("\nMethodTypeDesc: " + methodTypeDesc);

        Class<?> resolvedClass = (Class<?>) classDesc.resolveConstantDesc(MethodHandles.lookup());
        System.out.println("\nResolved Class: " + resolvedClass);
    }
}
