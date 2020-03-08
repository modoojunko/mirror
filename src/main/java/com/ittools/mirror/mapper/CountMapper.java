package com.ittools.mirror.mapper;

import com.ittools.mirror.model.CountModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CountMapper {

    @Insert("INSERT INTO count (total_visit_time, total_size, total_user_num, avg_speed, updated_at, created_at) " +
            "VALUES (#{totalVisitTime}, #{totalSize}, #{totalUserNum}, #{avgSpeed}, #{updatedAt}, #{createdAt});")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insert(CountModel countModel);

    @Select("SELECT * FROM count WHERE id=(select max(id) from count)")
    List<CountModel> getLatest();
}
