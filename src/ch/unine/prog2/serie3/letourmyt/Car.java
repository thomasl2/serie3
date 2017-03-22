package ch.unine.prog2.serie3.letourmyt;
/**
 * Created by thomas on 21/03/2017.
 */
public class Car {
    private double tank;
    private int odometer;

    public Car() {
        tank=0;
        odometer=0;
    }
    void print(){
        System.out.println("Car says: I travelled"+odometer+"km, and I still have"+tank+"liters of fuel left");
    }
}
