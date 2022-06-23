package States.PasswordStates;

import Detectors.Detector;
import States.State;

public class PasswordStartState extends State {
    public PasswordStartState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }
    @Override
    public void consumeInput(String character) {
        if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(character)){
            detector.setState(new PasswordHasCapitalLetterState(detector));
        }
        else if ("!@#$%&*".contains(character)){
            detector.setState(new PasswordHasSpecialCharacterState(detector));
        }
    }
}
