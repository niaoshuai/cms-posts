package ren.shuaipeng.cms.posts

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

/**
 * posts
 *
 * @author niaoshuai
 * @date 2019年03月05日08:59:26
 */
@Mapper
interface IPostsMapper {

    /**
     * 查询所有
     */
    @Select("select * from posts")
    fun findList(): List<Posts>

    /**
     * 新增
     */
    @Insert("insert into posts values(#{id},#{title},#{gmtCreate},#{gmtModified})")
    fun save(posts: Posts): Int

    /**
     * 修改
     */
    fun update(posts: Posts): Int

    /**
     * 删除
     */
    fun delete(id:Int): Int
}
