package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;

public class DownloadCapacity extends Benefits {
    private int downloadCapacity = 0;

    public int getDownloadCapacity() {
        return downloadCapacity;
    }

    public void setDownloadCapacity(int downloadCapacity) {
        this.downloadCapacity = downloadCapacity;
    }

}
