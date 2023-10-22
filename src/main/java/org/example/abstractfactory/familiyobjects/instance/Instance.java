package org.example.abstractfactory.familiyobjects.instance;

import org.example.abstractfactory.familiyobjects.storage.Storage;

public interface Instance {
    enum Capacity {micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
