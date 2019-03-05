package ren.shuaipeng.cms

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse
import ren.shuaipeng.cms.posts.PostsHandler

@Configuration
class AppRoutes {

    @Bean
    fun monoRouterFunction(postsHandler: PostsHandler): RouterFunction<ServerResponse?> {
        return route()
                .GET("/posts/list", postsHandler::findList)
                .PUT("/posts", postsHandler::save)
                .DELETE("/posts/{id}", postsHandler::delete)
                .POST("/post/{id}", postsHandler::update)
                .build()
    }

}


