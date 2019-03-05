package ren.shuaipeng.cms

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.HandlerFunction
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import ren.shuaipeng.cms.posts.PostsHandler

import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunctions.route

@Configuration
class AppRoutes {

    @Bean
    fun monoRouterFunction(postsHandler: PostsHandler): RouterFunction<ServerResponse?> {
        return route().GET("/findAll",postsHandler::findAllUser).build()
    }

}
