package ren.shuaipeng.cms.posts;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IPostsMapper {

    @Select("select * from posts")
    List<Posts> findAll();

    @Insert("insert into posts values(#{id},#{title},#{gmtCreate},#{gmtModified})")
    int save(Posts posts);
}
