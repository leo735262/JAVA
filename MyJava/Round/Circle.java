package JAVA.MyJava.Round;
import JAVA.MyJava.*;

public final class Circle extends Round implements Area,Constant {
    public Circle(String name,float r){
        setEntityName(name);
        EntityID=EntityCounter();
        Area=entityArea(r);
    }
    public float entityArea(float r){
        return PI*r*r;
    }
}
