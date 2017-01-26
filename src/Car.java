import java.awt.*;

/**
 * Created by adam on 23/01/2017.
 */
abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    public Direction direction = Direction.RIGHT; // right, left, up, down
    public Point.Double position = new Point.Double(0,0); // (x,y) position

    Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }


    abstract double speedFactor();
    abstract void incrementSpeed(double amount);
    abstract void decrementSpeed(double amount);

    void setTurboOn(){}; // needed?
    void setTurboOff(){}; // ??

    void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }


    void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }

    void startEngine() {
        currentSpeed = 0.1;
    }

    private void stopEngine() {
        currentSpeed = 0;
    }

    private enum Direction {
        RIGHT,
        LEFT,
        UP,
        DOWN
    }

    /**
     * Moves the position of the car according to its direction
     */
    @Override
    public void move() {
        switch (direction) {
            case LEFT:
                position.x -= currentSpeed;
                break;
            case RIGHT:
                position.x += currentSpeed;
                break;
            case UP:
                position.y += currentSpeed;
                break;
            case DOWN:
                position.y -= currentSpeed;
                break;
        }

    }

    /**
     * Changes the direction of the car depending on the current direction
     */
    @Override
    public void turnLeft() {
        switch (direction) {
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
        }
    }

    /**
     * Changes the direction of the car depending on the current direction
     */
    @Override
    public void turnRight() {
        switch (direction) {
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
        }
    }

    //Getters & setters below
    int getNrDoors() {
        return nrDoors;
    }

    double getEnginePower() {
        return enginePower;
    }

    double getCurrentSpeed() {
        return currentSpeed;
    }

    void setCurrentSpeed(double speed) {
        currentSpeed = speed;
    }

    Color getColor() {
        return color;
    }

    void setColor(Color clr) {
        color = clr;
    }

    String getModelName() { return modelName; }


}

