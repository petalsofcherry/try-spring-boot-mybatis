package cn.petalsofcherry.mapper;

import cn.petalsofcherry.domain.Tianguohua;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by luojingyu on 17-7-4.
 */
@Mapper
public interface TianguohuaMapper {


    @Select("SELECT * FROM tian_guo_hua order by id")
    public List<Tianguohua> selectByCondtion();
}
