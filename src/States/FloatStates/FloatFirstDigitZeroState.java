package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FloatFirstDigitZeroState extends State {
    public FloatFirstDigitZeroState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if(character.equals(".")){
            detector.setState(new FloatPeriodState(detector));
        }
        else{
            detector.setState(new FloatInvalidState(detector));
        }
    }
}
