package org.example.abstractfactory.familiyobjects.instance;

import org.example.abstractfactory.familiyobjects.storage.Storage;

public class Ec2Instance implements Instance {

  public Ec2Instance(Capacity capacity) {
    // Map capacity to ec2 instance types. Use aws api/sdk to provision
    System.out.println("Ec2Instance created");
  }

  @Override
  public void start() {
    System.out.println("Ec2Instance started");
  }

  @Override
  public void attachStorage(Storage storage) {
    System.out.println("Storage of Ec2" + storage + " attached");
  }

  @Override
  public void stop() {
    System.out.println("Ec2Instance stopped");
  }
}
