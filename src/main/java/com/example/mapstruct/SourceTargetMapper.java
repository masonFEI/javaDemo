/**
 * LY.com Inc.
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package com.example.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * SourceTargetMapper
 *
 * @author johnny.fei
 * @version 1.0.0
 * @since 2025-02-12 13:33
 */
@Mapper
public interface SourceTargetMapper {


    SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "age", target = "yearsOld")
    Target sourceToTarget(Source source);
}