package States.PasswordStates;

import Detectors.Detector;
import States.State;

public class PasswordValidComplexPasswordState extends State {
    public PasswordValidComplexPasswordState(Detector detector) {
        isAccepting = true;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if("!@#$%&*".contains(character)){
            detector.setState(new PasswordEndsWithSpecialCharacterState(detector));
        }
    }
}
