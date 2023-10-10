package org.example.factorymethod;

import org.example.factorymethod.creator.JSONMessageCreator;
import org.example.factorymethod.creator.MessageCreator;
import org.example.factorymethod.creator.TextMessageCreator;
import org.example.factorymethod.object.Message;

public class Main {

  public static void main(String[] args) {
    printMessage(new JSONMessageCreator());
    printMessage(new TextMessageCreator());
  }

  public static void printMessage(MessageCreator creator) {
    Message msg = creator.createMessage();
    System.out.println(msg.getContent());
  }
}
