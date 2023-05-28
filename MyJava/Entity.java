package JAVA.MyJava;

public class Entity {
    protected int EntityID;
    private String EntityName;
    private static int EntityCount=0;

    public final String getEntitygName(){
        return EntityName;
    }
    protected final void setEntitygName(String name){
        int len=name.length();
        for(int i=0;i<(12-len);i++)
            name+=" ";
        EntityName=name;
    }
    protected static final int EntityCounter(){
        return ++EntityCount;
    }
}
