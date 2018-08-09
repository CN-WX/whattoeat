package xyz.amazingxu.whattoeat.Service;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.amazingxu.whattoeat.DAO.DAO;
import xyz.amazingxu.whattoeat.DTO.DTO;
import xyz.amazingxu.whattoeat.mapper.WhatMapper;

import java.util.List;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 14:04
 */
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DAO dao;
    @Autowired
    private WhatMapper whatMapper;

    public List<DTO> list() {
        return whatMapper.from(dao.findAll());
    }

}
