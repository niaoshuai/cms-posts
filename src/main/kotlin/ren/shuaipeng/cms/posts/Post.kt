package ren.shuaipeng.cms.posts

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate


/**
 * 文章详情
 */
@Document
data class Post (
        @Id var id: String,
        var title: String?,
        var gmtCreate: LocalDate?,
        var gmtModified: LocalDate?
)
