package tools;

import akka.actor.*;

import java.io.File;

public class MyWebSocketActor extends UntypedActor {

  public static Props props(ActorRef out) {
    return Props.create(MyWebSocketActor.class, out);
  }

  private final ActorRef out;

  public MyWebSocketActor(ActorRef out) {
    this.out = out;
  }

  public void onReceive(Object message) throws Exception {
    if (message instanceof String) {
      File f = new File("~/projects");

      for(String s: f.list()) {
        
        out.tell("I received your message: " + s, self());
      }
    }
  }
}