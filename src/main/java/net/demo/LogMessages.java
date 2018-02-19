package net.demo;


public class LogMessages {
    public void logMethod (Object o){
        System.out.println(">>>> running: "+o.getClass().getEnclosingMethod().getName());
    }
}
