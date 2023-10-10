package org.example.factorymethod.object;

public abstract class Message {

  public abstract String getContent();

  public void addDefaultHeaders() {
    //Adds some default headers
  }

  public void encrypt() {
    //# Has some code to encrypt the content
  }
}
