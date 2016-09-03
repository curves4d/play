package controllers;

import akka.actor.*;
import play.libs.F.*;
import play.mvc.WebSocket;
import play.mvc.LegacyWebSocket;
import tools.MyWebSocketActor;

/**
 * Created by udbhav.singh on 9/2/16.
 */
public class WebSocketTest {

  public  LegacyWebSocket<String> socket() {
    return WebSocket.withActor(MyWebSocketActor::props);
  }

}
