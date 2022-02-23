public class MyProgram extends InitAndPeriodic {

    @Override
    public void init() {
        // setPeriod(2000);
        System.out.println("init: " + System.currentTimeMillis());
    }

    @Override
    public void periodic() {
        System.out.println("periodic: " + System.currentTimeMillis());
    }

    @Override
    public long getPeriod() {
        // TODO Auto-generated method stub
        return super.getPeriod();
    }

    @Override
    public void setPeriod(long period) {
        // TODO Auto-generated method stub
        super.setPeriod(period);
    }

}
