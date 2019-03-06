package ren.shuaipeng.cms.post

import org.springframework.data.repository.reactive.ReactiveSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : ReactiveSortingRepository<Post,String>
