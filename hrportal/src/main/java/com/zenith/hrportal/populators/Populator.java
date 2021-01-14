package com.zenith.hrportal.populators;

public interface Populator<SOURCE, TARGET>
{
    /**
     * Populate the target instance with values from the source instance.
     *
     * @param source the source object
     * @param target the target to fill
     */
    void populate(SOURCE source, TARGET target);
}