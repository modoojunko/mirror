package com.ittools.mirror.mapper;

import com.ittools.mirror.model.MirrorModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MirrorMapper {
    @Select("SELECT * FROM mirror")
    List<MirrorModel> getAll();

    @Select("SELECT * FROM mirror WHERE id=#{id}")
    List<MirrorModel> findById(@Param("id")long id);

    @Insert("INSERT INTO mirror(name,content,maintainer,updated_at,created_at) VALUES(#{name},#{content},#{maintainer},#{updatedAt},#{createdAt})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insert(MirrorModel mirrorModel);

    @Update("UPDATE mirror SET name=#{name},content=#{content},maintainer=#{maintainer},updated_at=#{updatedAt}" +
            "WHERE id=#{id}")
    void update(MirrorModel mirrorModel);

    @Delete("DELETE FROM mirror WHERE id=#{id}")
    void delete(@Param("id")long id);
}
