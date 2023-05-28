package JAVA.MyJava.Angle;
import JAVA.MyJava.*;

class Angle extends Entity implements Printable{
    protected float Circumference;
    public void printEntity(){
        System.out.println("ID="+EntityID+" Name="+"Circumference="+Circumference);
    }//getEntityName()+
}
