public class InitAndPeriodic {
    private final long DEFAULT_PERIOD = 20;
    private long period = DEFAULT_PERIOD;
    public long getPeriod() {return period;}
    public void setPeriod(long period) {this.period = period;}
    public void init() {};
    public void periodic() {};
}