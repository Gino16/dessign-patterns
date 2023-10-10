package org.example.factorymethod.creator;

import org.example.factorymethod.object.Message;


public abstract class MessageCreator {

  public Message getMessage() {
    Message msg = createMessage();

    msg.addDefaultHeaders();
    msg.encrypt();

    return msg;
  }

  //  Factory method
  public abstract Message createMessage();

  public void send() {
    Message msg = createMessage();
    System.out.println(msg.getContent());
  }
}
