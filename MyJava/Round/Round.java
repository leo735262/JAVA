package JAVA.MyJava.Round;
import JAVA.MyJava.*;

class Round extends Entity implements Printable{
    protected float Area;
    public void printEntity(){
        System.out.println("ID="+EntityID+" Name="+"Area="+Area);
    }//getEntityName()+
}