package org.example.factorymethod.creator;

import org.example.factorymethod.object.JSONMessage;
import org.example.factorymethod.object.Message;

public class JSONMessageCreator extends MessageCreator {

  @Override
  public Message createMessage() {
    return new JSONMessage();
  }
}


