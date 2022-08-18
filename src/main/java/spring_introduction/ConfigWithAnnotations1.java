package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("beanPerson", Person.class);
        person.callYourPet();



//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();
        context.close();
    }
}
