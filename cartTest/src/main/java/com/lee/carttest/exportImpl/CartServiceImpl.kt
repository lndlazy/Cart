package com.lee.carttest.exportImpl

import android.content.Context
import com.lee.export_cart.ICartService
import com.lee.export_cart.bean.CartInfo


/**
 * 购物车组件服务的实现
 * 需要@Route注解、指定CartRouterTable中定义的服务路由
 */
class CartServiceImpl : ICartService {


    override fun getProductCountInCar(): CartInfo {
        //这里实际项目中 应该是 请求接口 或查询数据库
        val cartInfo = CartInfo()
        cartInfo.productCount = 203
        return cartInfo

    }

    override fun init(context: Context?) {
        //初始化工作，服务注入时会调用，可忽略
    }
}