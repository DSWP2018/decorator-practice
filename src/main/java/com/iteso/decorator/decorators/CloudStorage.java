package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;

import java.util.ArrayList;

public class CloudStorage extends Benefits {
    private int cloudStorage = 0;

    public int getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(int cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

}
