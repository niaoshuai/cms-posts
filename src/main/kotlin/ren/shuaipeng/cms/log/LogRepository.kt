package ren.shuaipeng.cms.log

import org.springframework.data.repository.reactive.ReactiveSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface LogRepository : ReactiveSortingRepository<Log, String>