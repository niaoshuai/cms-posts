//package ren.shuaipeng.cms
//
//import kotlinx.coroutines.GlobalScope
//import org.aspectj.lang.annotation.Around
//import org.aspectj.lang.annotation.Aspect
//import org.aspectj.lang.ProceedingJoinPoint
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.stereotype.Component
//import org.springframework.web.reactive.function.server.ServerRequest
//import org.springframework.web.reactive.function.server.bodyToMono
//import ren.shuaipeng.cms.log.Log
//import ren.shuaipeng.cms.log.LogRepository
//import ren.shuaipeng.cms.post.Post
//
//
//@Aspect
//@Component
//class LogAspect {
//
//    @Autowired
//    private val logRepository: LogRepository? = null
//
//    @Around("execution (* ren.shuaipeng.cms.post.*Handler.*(..))")
//    fun log(joinPoint: ProceedingJoinPoint): Any? {
//        try {
//            var signature = joinPoint.signature
//            val thing = joinPoint.proceed()
//
//            println("method = ${signature.declaringTypeName}.${signature.name}")
////            println("params = ${joinPoint.args.}")
//            joinPoint.args.forEach {
//                if (it is ServerRequest){
//                    println(it.queryParams())
//                    println(it.pathVariables())
//                }
//            }
//
////            val log = Log("${signature.declaringTypeName}.${signature.name}",)
////            //异步协程 + 线程池
////            GlobalScope.run {
////                logRepository.save()
////            }
//            return thing
//        } catch (e: Throwable) {
//            e.printStackTrace()
//        }
//        return null
//    }
//}