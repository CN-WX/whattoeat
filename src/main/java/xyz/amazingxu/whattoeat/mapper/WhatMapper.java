package xyz.amazingxu.whattoeat.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import xyz.amazingxu.whattoeat.DO.DO;
import xyz.amazingxu.whattoeat.DTO.DTO;

import java.util.List;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 14:25
 */

@Mapper(componentModel = "spring")
public interface WhatMapper {

    @Mappings({@Mapping(source = "id",target = "id")})
    public DTO from (DO aDo);

    public DO to (DTO dto);

    public List<DTO> from (List<DO> dos);

    public List<DO> to (List<DTO> dtos);
}
