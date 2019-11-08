package test;

import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐传佳
 * @Description
 * @Date 创建于 2019/11/7 下午6:32
 */
public class UserTest {
    @Resource
    private PersonMapper mapper;

    @Test
    public void insertPersons(){
        String userName = "test";
        int age = 18;
        String mobilePhone = "18000000000@qq.com";
        Person person = new Person();
        person.setAge(age);
        person.setName(userName);
        person.setEmail(mobilePhone);
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        try{
           mapper.insertBatch(personList);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(person);
        }

    }
}
