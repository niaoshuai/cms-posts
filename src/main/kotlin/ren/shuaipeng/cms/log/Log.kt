package ren.shuaipeng.cms.log

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDateTime

@Document
class Log(var method: String?,
          var params: String?,
          var returns: String?
){
    @CreatedDate
    var gmtCreate: LocalDateTime? = null
    @LastModifiedDate
    var gmtModified: LocalDateTime? = null
}
