package ren.shuaipeng.cms

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableMongoAuditing

@Configuration
@EnableMongoAuditing
class AppConfig {

//    @Bean
//    fun log(): WebFilter {
//        return WebFilter { exchange, chain ->
//            println("request = ${exchange.request.path}")
//            chain.filter(exchange)
//        }
//    }
}

