package com.design.demo.filter;

import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:14 2019/8/18
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> personList);
}
