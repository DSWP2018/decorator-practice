package com.iteso.decorator;

/**
 *
 */
public class Benefit {
    /**
     * Benefit value.
     */
    private Object value;
    /**
     * Benefit description.
     */
    private String description;

    /**
     *
     * @param val to define the value of the benefit.
     * @param desc to define the description of the benefit.
     */
    public Benefit(final Object val, final String desc) {
        value = val;
        description = desc;
    }

    /**
     *
     * @return the value
     */
    public final Object getValue() {
        return value;
    }

    /**
     *
     * @return description
     */
    public final String getDescription() {
        return description;
    }

    /**
     *
     * @return string
     */
    @Override
    public final String toString() {
        return "Description: " + description
                + "\nValue: " + value;
    }
}

