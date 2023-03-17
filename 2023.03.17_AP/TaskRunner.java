public class TaskRunner {
    public static void runTogether(Runnable... tasks){
        for(Runnable task : tasks){
            new Thread(task).start();
        }
    }


    public static void runInOrder(Runnable... tasks){
        for(Runnable task : tasks){
            task.run();
        }
    }

}