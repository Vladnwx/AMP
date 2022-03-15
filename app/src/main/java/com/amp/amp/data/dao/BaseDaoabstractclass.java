package com.amp.amp.data.dao;

import androidx.room.RawQuery;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

import java.lang.reflect.ParameterizedType;

public abstract class BaseDaoabstractclass <T> {

    public int deleteAll() {
        SimpleSQLiteQuery query = new SimpleSQLiteQuery("delete from " + getTableName());
        return doDeleteAll(query);
    }
    public String getTableName() {
        Class clazz = (Class)
                ((ParameterizedType) getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0];
        String tableName = clazz.getSimpleName();
        return tableName;
    }
@RawQuery
    protected abstract int doDeleteAll(SupportSQLiteQuery query);

}
