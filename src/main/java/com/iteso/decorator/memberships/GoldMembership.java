package com.iteso.decorator.memberships;

import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class GoldMembership extends Benefits {
    /**Atributo estático para indicar la capacdad de descarga.*/
    public static final int DOWNLOAD_CAPACITY = 1000;
    /**Atributo estático para indicar el costo.*/
    public static final int COST = 599;
    /**Atributo estático para indicar la capacidad de storage en la nube.*/
    public static final int CLOUD_STORAGE = 500;
    /**Atributo estático para indicar la cantidad de dispositivos permitidos.*/
    public static final int ALLOWED_DEVICES = 10;
    /**Atributo estático para indicar el tipo de membresia.*/
    public static final String GOLD_MEMBERSHIP = "Gold Membership";
    /**Atributo estático para indicar la cantidad de logins simultáneos.*/
    public static final int SIMULTANEOUS_LOGINS = 3;
    /**Atributo estático para indicar si cuenta con soporte.*/
    public static final boolean SUPPORT = true;
    /**Atributo estático para indicar que es Free.*/
    public static final String FREE = "Gold";
    /**Atributo estático para indicar si cuenta con dispositivos ilimitados.*/
    public static final boolean UNLIMITED_DEVICES = false;

    /**
     * Constructor de la clase.
     * @param membership con una membresía base.
     */
    public GoldMembership(final Membership membership) {
        super(membership);
        setAllowedDevices(ALLOWED_DEVICES);
        setCloudStorage(CLOUD_STORAGE);
        setCost(COST);
        setDescription(GOLD_MEMBERSHIP);
        setDownloadCapacity(DOWNLOAD_CAPACITY);
        setSimultaneousLogins(SIMULTANEOUS_LOGINS);
        setSupport(SUPPORT);
        setSupportCoverage(FREE);
        setUnlimitedDevices(UNLIMITED_DEVICES);
    }

    /**
     * Método que regresa en un ArrayList los beneficios de la membresía.
     * @return ArrayList con la lista de beneficios.
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}
