package com.saran.thread;

class ThreadSend extends Thread
{
    private String msg;
    Sender  sender;
  
    // Receives a message object and a string
    // message to be sent
    ThreadSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }
  
    public void run()
    {
        // Only one thread can send a message
        // at a time.
       // synchronized(sender)
       // {
            // synchronizing the send object
            sender.send(msg);
      //  }
    }
}
  
