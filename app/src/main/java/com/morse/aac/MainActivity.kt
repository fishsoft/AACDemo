package com.morse.aac

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity<List<GanBean>,MainModel>() {
    override fun bindData(t: List<GanBean>?) {
        TODO("not implemented") //将网络数据与本地的接口进行适配
    }

    override fun bindModel(): Class<MainModel> {
        TODO("not implemented") //将ViewModel对象与Activity绑定
    }

    override fun bindLayout(): Int {
        return R.layout.activity_main
    }

    override fun bindView() {
        TODO("not implemented") //初始化view
    }
}
