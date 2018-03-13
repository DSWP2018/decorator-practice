package com.iteso.decorator.decorators;

import com.iteso.decorator.Benefits;

public class Devices extends Benefits {

    private boolean unlimitedDevices = false;

    private int allowedDevices = 0;

    public boolean isUnlimitedDevices() {
        return unlimitedDevices;
    }

    public void setUnlimitedDevices(boolean unlimitedDevices) {
        this.unlimitedDevices = unlimitedDevices;
    }

    public int getAllowedDevices() {
        return allowedDevices;
    }

    public void setAllowedDevices(int allowedDevices) {
        this.allowedDevices = allowedDevices;
    }

}
