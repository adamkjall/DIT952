import java.awt.*;

class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    Volvo240(){
        super(4,100,Color.black,"Volvo240");
    }


    @Override
    double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    void incrementSpeed(double amount){
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower());
        if(newSpeed >= 0){
            setCurrentSpeed(newSpeed);
        }
    }

    @Override
    void decrementSpeed(double amount){
        double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        if(newSpeed >= 0 && newSpeed <= getEnginePower()){
            setCurrentSpeed(newSpeed);
        }
    }


}
