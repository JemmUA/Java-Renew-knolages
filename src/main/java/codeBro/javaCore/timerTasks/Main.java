package codeBro.javaCore.timerTasks;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer =      A facility for to schedule tasks
        //              for future execution in background thread
        //
        // Timer task = A task can be scheduled for one-time
        //              or repeated execution by a Timer

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds ");
                    counter--;
                } else {
                    timer.cancel();

                    System.out.println("READY! Task is complete :)");
                }
            }

        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.APRIL);
        date.set(Calendar.DAY_OF_MONTH,13);
        date.set(Calendar.HOUR_OF_DAY,18);
        date.set(Calendar.MINUTE,00);
        date.set(Calendar.SECOND, 1);
        date.set(Calendar.MILLISECOND,0);

//        timer.schedule(task,3000);
//        timer.schedule(task,date.getTime());
//        timer.scheduleAtFixedRate(task,0, 1000);
        timer.scheduleAtFixedRate(task,date.getTime(), 1000);

    }
}
