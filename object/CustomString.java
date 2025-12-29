package practise.object;

public class CustomString {
    private int a;

    @Override
    public boolean equals(Object anObject){
        if(this == anObject){
            return true;
        }
        if(anObject == null || getClass() != anObject.getClass()){
            return false;
        }

        CustomString custom = (CustomString) anObject;
        return this.getA() == custom.getA();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(a*105);
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
