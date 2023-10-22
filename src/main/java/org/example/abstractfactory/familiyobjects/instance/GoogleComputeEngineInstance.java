package org.example.abstractfactory.familiyobjects.instance;

import org.example.abstractfactory.familiyobjects.storage.Storage;

public class GoogleComputeEngineInstance implements Instance {

  public GoogleComputeEngineInstance(Capacity capacity) {
    // Map capacity to GCE instance types. Use GCE api/sdk to provision
    System.out.println("GoogleComputeEngineInstance created");
  }

  @Override
  public void start() {
    System.out.println("GoogleComputeEngineInstance started");
  }

  @Override
  public void attachStorage(Storage storage) {
    System.out.println("Storage of Google" + storage + " attached");
  }

  @Override
  public void stop() {
    System.out.println("GoogleComputeEngineInstance stopped");
  }
}
