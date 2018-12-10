package com.morse.aac

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * activity基类
 */
abstract class BaseActivity<T, M : BaseViewModel<T>> : AppCompatActivity(), Observer<T> {

    var mModel: BaseViewModel<T>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindLayout())

        bindView()

        request()

        mModel = ViewModelProviders.of(this).get(bindModel())
        lifecycle.addObserver(BaseActivityLifecycle(this))
    }

    override fun onChanged(t: T?) {
        bindData(t)
    }

    /**
     * 绑定请求下来的数据，将网络数据与本地的接口进行适配
     */
    abstract fun bindData(t: T?)

    /**
     * 绑定viewModel，将ViewModel对象与Activity绑定
     */
    abstract fun bindModel(): Class<M>

    /**
     * 绑定视图布局
     */
    abstract fun bindLayout(): Int

    /**
     * 绑定view，初始化View
     */
    abstract fun bindView()

    /**
     * 数据请求
     */
    fun request() {

    }
}