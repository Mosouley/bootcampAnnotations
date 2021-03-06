package com.bootcamp.database.pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by darextossa on 11/19/17.
 */
public class Criterias {
    private List<Criteria> criteriaList;

    public Criterias() {
    }

    public Criterias(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    public List<Criteria> getCriteriaList() {
        return criteriaList;
    }

    public void setCriteriaList(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    public String getAsStringQuery(String entityPrefix){
        String str="";
        for(Criteria criteria: criteriaList){
          str = str + criteria.getAsStringQuery(entityPrefix);
        }
        return str;
    }

    public void addCriteria(Criteria criteria){
        if(criteriaList == null) criteriaList = new ArrayList<Criteria>();
        criteriaList.add(criteria);
    }
}
