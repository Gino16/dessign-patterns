package org.example.abstractfactory.familiyobjects.storage;

public class GoogleCloudStorage implements Storage {


  public GoogleCloudStorage(int capacityInMib) {
    System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
  }

  @Override
  public String getId() {
    return "gc1";
  }

  @Override
  public String toString() {
    return "GoogleCloudStorage{}";
  }
}
