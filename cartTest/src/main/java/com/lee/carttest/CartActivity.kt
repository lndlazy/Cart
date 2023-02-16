package com.lee.carttest

import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.lee.commontest.base.BaseActivity

@Route(path = "cart/cartActivity")
class CartActivity : BaseActivity() {

    override fun getViewId(): Int = R.layout.activity_cart

    override fun initData() {

        val stringExtra = intent?.getStringExtra("str")
        val intExtra = intent?.getIntExtra("int", -1)
        val booleanExtra = intent?.getBooleanExtra("boolean", false)
        println("CartActivity ==>>> str:$stringExtra, intExtra:${intExtra}, booleanExtra:$booleanExtra")

    }

    override fun initView() {

        findViewById<Button>(R.id.btn).setOnClickListener {
            //cart跳转到首页
            ARouter.getInstance().build("/home/homeActivity")
                .withString("str", "cartActivity跳转过来的")
                .withInt("int", 555)
                .withBoolean("boolean", true)
                .navigation()
        }

    }
}