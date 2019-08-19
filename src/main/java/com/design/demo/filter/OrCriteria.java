package com.design.demo.filter;

import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:15 2019/8/18
 */
public class OrCriteria implements Criteria {

   private  Criteria criteria;
   private  Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> people = criteria.meetCriteria(personList);
        List<Person> otherPeople = otherCriteria.meetCriteria(people);

        otherPeople.stream().forEach(person -> {
            if(!people.contains(person)){
                people.add(person);
            }
        });

        return people;

    }
}
