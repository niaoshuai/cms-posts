package ren.shuaipeng.cms.posts

import org.apache.ibatis.annotations.*

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
    @Update("update posts set title = #{title} , gmt_modified = #{gmtModified} where id = #{id}")
    fun update(posts: Posts): Int

    /**
     * 删除
     */
    @Delete("delete from posts where id = #{id}")
    fun delete(id:String): Int
}
