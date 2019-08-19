package com.design.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:15 2019/8/18
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> femalePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
