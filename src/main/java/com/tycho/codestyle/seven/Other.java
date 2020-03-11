package com.tycho.codestyle.seven;
/**
 * 七-11 【参考】下列情形，需要进行参数校验：
1） 调用频次低的方法。
2） 执行时间开销很大的方法。此情形中，参数校验时间几乎可以忽略不计，但如果因为参数错误导致
中间执行回退，或者错误，那得不偿失。
3） 需要极高稳定性和可用性的方法。
4） 对外提供的开放接口，不管是 RPC/API/HTTP 接口。
5） 敏感权限入口。
       七-12 【参考】下列情形，不需要进行参数校验：
1） 极有可能被循环调用的方法。但在方法说明里必须注明外部参数检查要求。
2） 底层调用频度比较高的方法。毕竟是像纯净水过滤的最后一道，参数错误不太可能到底层才会暴露
问题。一般 DAO 层与 Service 层都在同一个应用中，部署在同一台服务器中，所以 DAO 的参数校验，可
以省略。
3） 被声明成 private 只会被自己代码所调用的方法，如果能够确定调用方法的代码传入参数已经做过检
查或者肯定不会有问题，此时可以不校验参数。
 * @author shenjuntao
 * @date 2020年1月10日
 */
public class Other {

}
