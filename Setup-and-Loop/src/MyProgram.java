public class MyProgram extends SetupAndLoop {

    @Override
    public void setup() {
        System.out.println("setup. " + System.currentTimeMillis());
    }

    @Override
    public void loop() {
        System.out.println("loop. " + System.currentTimeMillis());
    }
}
