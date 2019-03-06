package ren.shuaipeng.cms

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router
import ren.shuaipeng.cms.post.PostHandler

@Configuration
class AppRoutes(
        private val postsHandler: PostHandler
) {

    @Bean
    fun appRouter() = router {
        "/post".nest {
            GET("/", postsHandler::findAll)
            POST("/",postsHandler::save)
            DELETE("/{id}",postsHandler::deleteAll)
        }
    }
}


