/**
 * Created by darextossa on 11/19/17.
 */

package com.bootcamp.database.pojos;


import com.bootcamp.database.utils.DatabaseUtils;

public class Criteria {

    private Rule rule;
    private String linkOperator;

    public Criteria() {
    }

    public Criteria(Rule rule, String linkOperator) {
        this.rule = rule;
        this.linkOperator = linkOperator;
    }

    public Criteria(String column, String operator, Object value, String linkOperator) {
        this.rule = new Rule(column, operator, value);
        this.linkOperator = linkOperator;
    }

    public Criteria(String column, String operator, Object value) {
        this.rule = new Rule(column, operator, value);
        this.linkOperator = null;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getLinkOperator() {
        return linkOperator;
    }

    public void setLinkOperator(String linkOperator) {
        this.linkOperator = linkOperator;
    }

    public String getAsStringQuery(String entityPrefix){
        if(DatabaseUtils.isNullOrEmpty(linkOperator))
            return rule.getAsStringQuery(entityPrefix);
        else
            return rule.getAsStringQuery(entityPrefix)+" "+linkOperator;
    }
}
