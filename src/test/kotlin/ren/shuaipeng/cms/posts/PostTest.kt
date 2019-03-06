package ren.shuaipeng.cms.posts


import org.testng.Assert.assertNotNull
import org.testng.annotations.Test
import java.time.LocalDate

class PostTest  {

    @Test
    fun `Create Posts`() {
        var post = Post("12","12", LocalDate.now(), LocalDate.now())
        assertNotNull(post)
    }
}