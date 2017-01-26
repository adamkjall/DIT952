import java.awt.*;

class Saab95 extends Car{

    private boolean turboOn;

    Saab95(){
        super(2,125,Color.red,"Saab95");
        turboOn = false;
    }

    //@Override
    void setTurboOn(){
        turboOn = true;
    }

    //@Override
    void setTurboOff(){
        turboOn = false;
    }

    @Override
    double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    @Override
    void incrementSpeed(double amount) {
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        if (newSpeed >= 0) {
            setCurrentSpeed(newSpeed);
        }
    }

    @Override
    void decrementSpeed(double amount){
        double newSpeed = getCurrentSpeed() - speedFactor() * amount;
        if(newSpeed >= 0 && newSpeed <= getEnginePower()){
            setCurrentSpeed(newSpeed);
        }
    }


}
