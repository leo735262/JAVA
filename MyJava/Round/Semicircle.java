package JAVA.MyJava.Round;
import JAVA.MyJava.*;

public final class Semicircle extends Round implements Area,Constant {
    public Semicircle(String name,float r){
        setEntityName(name);
        EntityID=EntityCounter();
        Area=entityArea(r);
    }
    public float entityArea(float r){
        return PI*r*r/2;
    }
}
