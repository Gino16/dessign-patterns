package org.example.abstractfactory.factory;

import org.example.abstractfactory.familiyobjects.instance.Ec2Instance;
import org.example.abstractfactory.familiyobjects.instance.Instance;
import org.example.abstractfactory.familiyobjects.instance.Instance.Capacity;
import org.example.abstractfactory.familiyobjects.storage.S3Storage;
import org.example.abstractfactory.familiyobjects.storage.Storage;

public class AwsResourceFactory implements ResourceFactory {

  @Override
  public Instance createInstance(Capacity capacity) {
    return new Ec2Instance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new S3Storage(capMib);
  }
}
