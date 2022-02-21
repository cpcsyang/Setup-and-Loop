public class SetupAndLoop {
    private long period;
    private final MyProgram program;

    public SetupAndLoop(MyProgram program) {
        period = 20;    // default time period is 20 ms (or 50 Hz, cycles per second)
        this.program = program;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public long getPeriod() {
        return period;
    }
    
}
