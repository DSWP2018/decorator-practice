package com.iteso.decorator;

import java.util.ArrayList;

/**
 * Clase base que extiende de Membership.
 */
public class BaseMembership extends Membership {
    /**Atributo estático que indica la capacidad de descarga.*/
    public static final int DOWNLOAD_CAPACITY = 150;
    /**Atributo estático que indica el costo de la membresía.*/
    public static final int COST = 0;
    /**Atributo estático que indica la capacidad de almacenaje en la nube.*/
    public static final int CLOUD_STORAGE = 50;
    /**Atributo estático que indica la cantidad de dispositivos permitidos.*/
    public static final int ALLOWED_DEVICES = 1;
    /**Atributo estático que indica el tipo de membresía.*/
    public static final String GOLD_MEMBERSHIP = "Free Membership";
    /**Atributo estático que indica la capacidad de cuentas
     *loggeadas al mismo tiempo.*/
    public static final int SIMULTANEOUS_LOGINS = 1;
    /**Atributo estático que indica si incluye soporte.*/
    public static final boolean SUPPORT = false;
    /**Atributo estático que indica el tipo de membresía.*/
    public static final String FREE = "Free";
    /**Atributo estático que indica si permite dispositivos ilimitados.*/
    public static final boolean UNLIMITED_DEVICES = false;

    /**Constructor de la clase.*/
    public BaseMembership() {
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
     * Método que permite obtener todos los beeficios de la membresía.
     * @return ArrayList con la lista de beneficios.
     */
    public final ArrayList getAllBenefits() {
        return null;
    }
}
