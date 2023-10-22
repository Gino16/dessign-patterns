package org.example.abstractfactory.factory;

import org.example.abstractfactory.familiyobjects.storage.GoogleCloudStorage;
import org.example.abstractfactory.familiyobjects.instance.GoogleComputeEngineInstance;
import org.example.abstractfactory.familiyobjects.instance.Instance;
import org.example.abstractfactory.familiyobjects.instance.Instance.Capacity;
import org.example.abstractfactory.familiyobjects.storage.Storage;

public class GoogleResourceFactory implements ResourceFactory {

  @Override
  public Instance createInstance(Capacity capacity) {
    return new GoogleComputeEngineInstance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new GoogleCloudStorage(capMib);
  }
}
