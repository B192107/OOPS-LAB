class trafficlight{
    String signal;
    trafficlight(){
        this.signal="red";
    }
    public synchronized void changesignal(){
        switch(signal){
            case "red":
                System.out.println("Red light is on");
                break;
            case "yellow":
                System.out.println("yellow light is on");
                break;
             case "green":
                System.out.println("green light is on");
                break;
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        switch(signal){
            case "red":
                signal="yellow";
                break;
            case "yellow":
                signal="green";
                break;
            case "green":
                signal="red";
                break;
        }
    }
}
class control extends Thread{
    trafficlight tl;
    control(trafficlight tl){
        this.tl=tl;
    }
    public void run(){
        while(true){
            tl.changesignal();
        }
    }
}
class thread3{
    public static void main(String main[]){
        trafficlight t=new trafficlight();

        control c=new control(t);
        c.start();
    }
}