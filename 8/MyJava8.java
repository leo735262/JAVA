class Car{
	int price;
}
interface Carspeed{
    void maxSpeed();
}

class Toyota extends Car implements Carspeed{
    public void maxSpeed(){
        System.out.println("180");
    }
}

class Porsche extends Car implements Carspeed{
    public void maxSpeed(){
        System.out.println("280");
    }
}

class Ferrari extends Car implements Carspeed{
    public void maxSpeed(){
        System.out.println("320");
    }
}

public class MyJava8 {
    public static void main(String[] args){
		Carspeed[] c={new Ferrari(),new Porsche(),new Toyota()};
        for(int i=0;i<c.length;i++){
            c[i].maxSpeed();
        }
	}
}