package command.remote;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff= new LightOffCommand(light);
        GarageDoorUpCommand garageOpen =
                new GarageDoorUpCommand(garageDoor);
        Stereo stereo = new Stereo("거실");
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
    }
}
