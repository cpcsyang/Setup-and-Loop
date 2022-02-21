public class App {
    public static void main(String[] args) throws Exception {
        App.start();

        // ElapsedTime time = new ElapsedTime(5000);
        // while(!time.timesUp()){
        //     System.out.println("time remain: " + time.getTimeRemain());
        // }
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(time.getTimeRemain() + ", timesUp: " + time.timesUp());
        // }

        System.out.println("program complete.");
    }

    private static void start() {
        MyProgram prog = new MyProgram();
        prog.setup();
        ElapsedTime t = new ElapsedTime();
        t.setTime(prog.getPeriod());
        prog.loop();
        while (true) {
            if(t.timesUp()) {
                t.reset();           
                prog.loop();    
            }
        }
    }
}
