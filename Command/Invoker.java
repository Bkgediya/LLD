import java.util.Stack;

class Invoker {

    private Command command;
    private final Stack<Command> history = new Stack();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
            history.push(command);
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lst = history.pop();
            lst.undo();
        }
    }
}
