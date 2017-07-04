package cn.petalsofcherry.mapper;

import cn.petalsofcherry.domain.Tianguohua;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * Created by luojingyu on 17-7-4.
 */
@Mapper
public interface TianguohuaMapper {


    @Select("SELECT * FROM tian_guo_hua order by id")
    public List<Tianguohua> selectByCondtion();
}
