package cn.petalsofcherry.mapper.problem;

import cn.petalsofcherry.domain.Problem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by luojingyu on 17-7-4.
 */

@Mapper
public interface ProblemMapper {

    @Select("SELECT * FROM problem limit 20")
    public List<Problem> selectByCondition();
}
