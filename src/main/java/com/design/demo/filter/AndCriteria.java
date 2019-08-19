package com.design.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:15 2019/8/18
 */
public class AndCriteria implements Criteria {

   private  Criteria criteria;
   private  Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> people = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(people);
    }
}
