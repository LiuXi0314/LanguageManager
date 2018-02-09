package com.lx.language.manager.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lx.language.manager.utils.Keys
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

abstract open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContView()
        refreshUi()
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().unregister(this)
    }

    abstract fun setContView()

    abstract fun refreshUi()

    @Subscribe(threadMode = ThreadMode.MAIN)
    protected fun refreshUi(keys: Keys) {
        if (keys == Keys.RefreshUi) {
            refreshUi()
        }
    }


}
