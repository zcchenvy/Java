package code_00_thread.threadSynchronization.synchronizedBlock;

public class SyncThreadTest {
    public static void main(String[] args) {
        SyncThread st=new SyncThread();

        Thread t1=new Thread(st);
        Thread t2=new Thread(st);

        t2.start();
        t1.start();
    }
}