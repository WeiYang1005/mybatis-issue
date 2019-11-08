package test;

import lombok.Data;

/**
 * @author 徐传佳
 * @Description
 * @Date 创建于 2019/11/7 下午6:19
 */
@Data
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person baseModel = (Person) o;

        return id.equals(baseModel.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
