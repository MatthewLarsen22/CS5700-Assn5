package States.FloatStates;

import Detectors.Detector;
import States.State;

public class FloatStartState extends State {
    public FloatStartState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if ("123456789".contains(character)){
            detector.setState(new FLoatIntState(detector));
        }
        else if (character.equals("0")){
            detector.setState(new FloatFirstDigitZeroState(detector));
        }
        else if (character.equals(".")){
            detector.setState(new FloatPeriodState(detector));
        }
        else{
            detector.setState(new FloatInvalidState(detector));
        }
    }
}
