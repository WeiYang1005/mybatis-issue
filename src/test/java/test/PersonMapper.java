package test;

import java.util.List;

/**
 * @author 徐传佳
 * @Description
 * @Date 创建于 2019/11/7 下午6:29
 */
public interface PersonMapper {
    int insertBatch(List<Person> persons);
}
