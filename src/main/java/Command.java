public abstract class Command {
    protected String action;
    protected String description;
    protected String time;
    protected int n;
    protected Task task;
    protected boolean exit = false;

    public abstract void execute(TaskList t, Ui ui, Storage storage) throws DukeException;
    public boolean isExit() {
        return this.exit;
    }
}