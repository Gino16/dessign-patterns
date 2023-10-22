package org.example.abstractfactory;

import org.example.abstractfactory.factory.AwsResourceFactory;
import org.example.abstractfactory.factory.GoogleResourceFactory;
import org.example.abstractfactory.factory.ResourceFactory;
import org.example.abstractfactory.familiyobjects.instance.Instance;
import org.example.abstractfactory.familiyobjects.storage.Storage;

public class Client {

  private final ResourceFactory factory;

  public Client(ResourceFactory factory) {
    this.factory = factory;
  }

  public Instance createServer(Instance.Capacity capacity, int storageMib) {
    Instance instance = factory.createInstance(capacity);
    Storage storage = factory.createStorage(storageMib);
    instance.attachStorage(storage);
    return instance;
  }

  public static void main(String[] args) {
    Client aws = new Client(new AwsResourceFactory());
    Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
    i1.start();
    i1.stop();

    System.out.println("************************************");

    Client gcp = new Client(new GoogleResourceFactory());
    Instance i2 = gcp.createServer(Instance.Capacity.micro, 20480);
    i2.start();
    i2.stop();
  }
}
