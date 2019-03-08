package ren.shuaipeng.cms

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.data.mongodb.config.EnableMongoAuditing

@Configuration
@EnableMongoAuditing
@EnableAspectJAutoProxy
class AppConfig
