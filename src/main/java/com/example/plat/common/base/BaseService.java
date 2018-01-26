package com.example.plat.common.base;

import java.io.Serializable;

public interface BaseService<T extends Serializable> {

    int deleteByPrimaryKey(Object id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(T record);

    int updateByExampleSelective(T record, Object id);

    int updateByPrimaryKey(T record);
}
