import static java.lang.System.out;

/**
 * Created by adam on 25/01/2017.
 */
public class Test {

    public static void main(String[] args){

        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.turnRight();
        saab.gas(1);
        saab.move();
        saab.turnRight();
        saab.gas(1);
        saab.move();
        out.println(saab.position);

        //saab.startEngine();
        //volvo.startEngine();

        //volvo.gas(1);
        //volvo.brake(0.25);
        //saab.gas(1);
        //saab.brake(0.25);

        //saab.setTurboOn();
        //saab.gas(1);
        //volvo.gas(1);

        /*out.println("Volvo nrDoors: " + volvo.getNrDoors());
        out.println("Volvo engine power: " + volvo.getEnginePower());
        out.println("Volvo speed: " + volvo.getCurrentSpeed());
        out.println("Volvo color: " + volvo.getColor());
        out.println("Volvo model: " + volvo.getModelName());

        out.println();

        out.println("Saab nrDoors: " + saab.getNrDoors());
        out.println("Saab engine power: " + saab.getEnginePower());
        out.println("Saab speed: " + saab.getCurrentSpeed());
        out.println("Saab color: " + saab.getColor());
        out.println("Saab model: " + saab.getModelName());
        */
    }
}
