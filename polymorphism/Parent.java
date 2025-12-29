package practise.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parent {
    private String parentName;
    private String parentAge;

    public List<Integer> getValue(){
        return new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentAge() {
        return parentAge;
    }

    public void setParentAge(String parentAge) {
        this.parentAge = parentAge;
    }
}
