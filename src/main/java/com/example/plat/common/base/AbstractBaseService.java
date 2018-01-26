package com.example.plat.common.base;

import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;

public abstract class AbstractBaseService<T extends Serializable> implements BaseService<T> {

    public abstract Mapper<T> getMapper();

    @Override
    public int deleteByPrimaryKey(Object id) {
        return this.getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(T record) {
        return this.getMapper().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(Object id) {
        return this.getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return this.getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int updateByExampleSelective(T record, Object id) {
        return this.getMapper().updateByExampleSelective(record, id);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return this.getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int insert(T record) {
        return this.getMapper().insert(record);
    }
}
