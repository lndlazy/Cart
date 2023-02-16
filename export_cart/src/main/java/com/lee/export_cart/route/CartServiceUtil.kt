package com.lee.export_cart.route

import com.alibaba.android.arouter.launcher.ARouter
import com.lee.export_cart.ICartService
import com.lee.export_cart.bean.CartInfo

object CartServiceUtil {

    //跳转到购物车页面
    fun navigationCartPage(vararg params: List<String>) {
        ARouter.getInstance().build(PATH_PAGE_CART).navigation()
    }

    /**
     * 获取服务
     */
    private fun getCartService(): ICartService {
        return ARouter.getInstance().build(PATH_SERVICE_CART).navigation() as ICartService
    }


    /**
     * 获取购物车中商品数量
     */
    fun getCartProductCount(): CartInfo {
        return getCartService().getProductCountInCar()
    }

}