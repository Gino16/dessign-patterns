package org.example.factorymethod.creator;

import org.example.factorymethod.object.Message;
import org.example.factorymethod.object.TextMessage;

public class TextMessageCreator extends MessageCreator{

  @Override
  public Message createMessage() {
    return new TextMessage();
  }
}
