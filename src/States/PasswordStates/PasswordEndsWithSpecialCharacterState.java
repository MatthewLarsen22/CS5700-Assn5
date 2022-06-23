package States.PasswordStates;

import Detectors.Detector;
import States.State;

public class PasswordEndsWithSpecialCharacterState extends State {
    public PasswordEndsWithSpecialCharacterState(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if(!"!@#$%&*".contains(character)){
            detector.setState(new PasswordValidComplexPasswordState(detector));
        }
    }
}
