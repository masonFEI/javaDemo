/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.mapstruct;

import lombok.Data;

/**
 * Target
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-12 13:32
 */
@Data
public class Target {

    private String fullName;
    private int yearsOld;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;

    }

}