package cn.zenglin.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件配置的每一个属性，映射到这个组中
 * @ConfigurationProperties，告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "person"，配置文件中哪个下面的属性进行一一映射
 * 只有这个组件是容器中的组件，才能使用容器提供的功能
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastname;
    private Integer age;
    private Boolean boss;
    private LocalDate birth;

    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    public Person() {
    }

    public Person(String lastname, Integer age, Boolean boss) {
        this.lastname = lastname;
        this.age = age;
        this.boss = boss;
    }

    public Person(String lastname, Integer age, Boolean boss, LocalDate birth) {
        this.lastname = lastname;
        this.age = age;
        this.boss = boss;
        this.birth = birth;
    }

    public Person(String lastname, Integer age, Boolean boss, LocalDate birth, Map<String, Object> map, List<Object> list, Dog dog) {
        this.lastname = lastname;
        this.age = age;
        this.boss = boss;
        this.birth = birth;
        this.map = map;
        this.list = list;
        this.dog = dog;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
