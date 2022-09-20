package com.saran.thread;

class Synch
{
    public static void main(String args[])
    {
        Sender send = new Sender();
        ThreadSend S1 =
            new ThreadSend( " Hi " , send );
        ThreadSend S2 =
            new ThreadSend( " Bye " , send );
  
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();
  
        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}