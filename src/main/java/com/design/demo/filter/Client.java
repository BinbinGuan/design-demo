package com.design.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午11:27 2019/8/18
 */
public class Client {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("lisi","Male","Single"));
        people.add(new Person("zhangsan","Male","Single"));
        people.add(new Person("wangwu","Female","Married"));
        people.add(new Person("zhangliu","Male","Married"));
        people.add(new Person("wangsi","Female","Single"));

        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();

        //即为女士又是单身的人
        AndCriteria andCriteria = new AndCriteria(criteriaMale,criteriaSingle);
        //男士和单身的人
        OrCriteria orCriteria = new OrCriteria(criteriaFemale,criteriaSingle);

        System.out.println("-----Male");
        printPersons(criteriaMale.meetCriteria(people));
        System.out.println("-----Female");
        printPersons(criteriaFemale.meetCriteria(people));
        System.out.println("-----Single");
        printPersons(criteriaSingle.meetCriteria(people));
        System.out.println("-----Male and Single");
        printPersons(andCriteria.meetCriteria(people));
        System.out.println("-----Femal or Single");
        printPersons(orCriteria.meetCriteria(people));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
