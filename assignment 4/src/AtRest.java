public class AtRest extends State {
    
    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }

    public Boolean pressRightPedal(int numOfTimesPressed) {
        if(numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if(numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}