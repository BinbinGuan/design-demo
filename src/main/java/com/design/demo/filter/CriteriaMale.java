package com.design.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:15 2019/8/18
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> malePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
