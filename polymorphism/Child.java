package practise.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Child extends Parent{
    private String childName;
    private String childAge;

    @Override
    public LinkedList<Integer> getValue(){
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        LinkedList<Integer> arr = new LinkedList<>(Arrays.asList(0,1,2,3,4,5));
//        arr.add(6);
        return arr;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}
