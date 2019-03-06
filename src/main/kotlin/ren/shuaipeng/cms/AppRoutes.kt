package ren.shuaipeng.cms

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import ren.shuaipeng.cms.posts.PostHandler

@Configuration
class AppRoutes(
        private val postsHandler: PostHandler
) {

    @Bean
    fun appRouter() = router {
        "/post".nest {
            GET("/", postsHandler::findAll)
            GET("/{title}", postsHandler::findTitle)
        }
    }
}


