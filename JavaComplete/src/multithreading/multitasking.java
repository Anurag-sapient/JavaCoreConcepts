package multithreading;

//process based multitasking-two process are running simultaneously
//thread based multitasking - within same program multiple thread

//thread vs process- two thread same address space and fast context switching & cost of communication less

//thread-single unit of execution
//thread- user threads & daemon thread
//jvm terminate when user thread done even if daemon is not done
// extend thread class or implement runnable
//thread internally calling runnable run only
// Best way is to do using Runnable so we dont need to face mutiple inheritance issue
//start basically calls run method
//synchronisation helps in overcoming the lock situation where common resource leads to issue
//for static method TVSet
//volatile -with singleton pattern to prevent memory access issue with shared resource


public class multitasking {

    public static void main(String[] args) {

//        2 WAYS OF RUNNING THREAD -thread or by Runnable
        System.out.println("main thread starting ");
        Thread thread1 =new Thread1();
        thread1.start();
        new Thread(new Thread2()).start();
        new Thread(()->{
            for(int i=0;i<5;i++)System.out.println("running thread using Lambda Expression");
        }).start();
        System.out.println("main thread ending ");

//      using stack pop and push
//        this issue of frequent use of same resource is solved by synchronisation
        Stack stack=new Stack(5);
        new Thread(()->{
            int cnt=0;
            while(cnt++<9){
                System.out.println("pushed:"+stack.push(100));
            }
        },"Pusher").start();
        new Thread(()->{
            int cnt=0;
            while(cnt++<9){
                System.out.println("popped:"+stack.pop());
            }
            },"Popper").start();
    }
}