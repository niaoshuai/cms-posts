package ren.shuaipeng.cms.posts

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import org.testng.annotations.Test

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostRepositoryTest
    : AbstractTestNGSpringContextTests() {

    @Autowired
    private val postRepository: PostRepository? = null

    @Test
    fun testCount() {

    }

    @Test
    fun testFindAll() {
    }

    @Test
    fun testFindByTitle() {
    }

    @Test
    fun testSave() {
    }

    @Test
    fun testDelete() {
    }

    @Test
    fun testDeleteAll() {
    }

}