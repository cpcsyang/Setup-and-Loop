public class ElapsedTime {
    private long startTime;
    private long endTime;
    private long time = 20;
    
    public ElapsedTime() {
        reset();
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void reset() {
        startTime = System.currentTimeMillis();
        endTime = startTime + time;
    }

    public long getTimeRemain() {
        return endTime - System.currentTimeMillis();
    }

    public boolean timesUp() {
        return getTimeRemain() <= 0;
    }
}
