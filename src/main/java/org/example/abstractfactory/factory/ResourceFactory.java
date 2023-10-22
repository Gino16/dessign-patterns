package org.example.abstractfactory.factory;

import org.example.abstractfactory.familiyobjects.instance.Instance;
import org.example.abstractfactory.familiyobjects.storage.Storage;

public interface ResourceFactory {

  Instance createInstance(Instance.Capacity capacity);

  Storage createStorage(int capMib);
}
