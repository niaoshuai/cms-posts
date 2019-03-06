package ren.shuaipeng.cms.post

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime


/**
 * 文章详情
 */
@Document
data class Post (
        @Id var id: String,
        var title: String?
) {

    @CreatedDate   var gmtCreate: LocalDateTime? = null
    @LastModifiedDate var gmtModified: LocalDateTime? = null
}
