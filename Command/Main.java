class Main {

    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // concrete command
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // macro commands
        MacroCommand partyMode = new MacroCommand();
        partyMode.add(lightOn);

        //Invoker
        Invoker remote = new Invoker();
        // Normal usage
        remote.setCommand(lightOn);
        remote.pressButton(); // Light is ON

        remote.setCommand(lightOff);
        remote.pressButton(); // Light is OFF

        remote.pressUndo(); // Light is ON (undo last command)

        // Macro usage
        remote.setCommand(partyMode);
        remote.pressButton(); // executes all commands in macro
        remote.pressUndo(); // undoes them in reverse order
    }
}
