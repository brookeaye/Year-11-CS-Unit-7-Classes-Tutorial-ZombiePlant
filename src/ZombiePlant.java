public class ZombiePlant {
    int potency;
    int treatmentTarget;
    int treatmentsNow = 0;

    public ZombiePlant(int pot, int trt){
        treatmentTarget = trt;
        potency = pot;
    }
    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatmentTarget - treatmentsNow;
    }
    public boolean isDangerous(){
        return (treatmentsNeeded() >= 1);
    }

    public void treat(int pot){
        if (pot > potency){
            treatmentsNow--;
        }
        if (!isDangerous()){
            return;
        }
        if (pot <= 0){
            return;
        }
        if (pot <= potency){
            treatmentsNow++;
        }
    }

}
