/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.LombokCopy;

import lombok.Getter;
import lombok.Builder;
import lombok.Setter;

/**
 * TransferParamDTOWithLombok
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-17 16:56
 */
@Builder(toBuilder = true)
@Getter
@Setter
public class TransferParamDTOWithLombok {

    private String param1;
    private int param2;

    @Override
    public String toString() {
        return "TransferParamDTOWithLombok{" +
                "param1='" + param1 + '\'' +
                ", param2=" + param2 +
                '}';
    }

}