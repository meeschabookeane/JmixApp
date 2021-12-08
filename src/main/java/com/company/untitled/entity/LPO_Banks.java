package com.company.untitled.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum LPO_Banks implements EnumClass<String> {

    ATABANK("Atabank"),
    AGBANK("AGBank");

    private String id;

    LPO_Banks(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LPO_Banks fromId(String id) {
        for (LPO_Banks at : LPO_Banks.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}