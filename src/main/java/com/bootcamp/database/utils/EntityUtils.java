package com.bootcamp.database.utils;

import javax.persistence.Tuple;

/**
 * Created by darextossa on 11/20/17.
 */
public class EntityUtils<T> {

    private Class entityClass;

    public EntityUtils(Class entityClass) {
        this.entityClass = entityClass;
    }

    public void convertTupleToObject(Tuple tuple){

    }
}
