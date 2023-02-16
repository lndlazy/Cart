package com.lee.export_cart

import com.alibaba.android.arouter.facade.template.IProvider
import com.lee.export_cart.bean.CartInfo

interface ICartService : IProvider {

    //获取购物车中商品的数量
    fun getProductCountInCar(): CartInfo

}