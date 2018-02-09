package com.lx.language.manager.activity

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import com.lx.language.manager.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setContView() {
        setContentView(R.layout.activity_main)
    }

    override fun refreshUi() {
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.setting, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == R.id.language_change) {
            startActivity(Intent(this, LanguageActivity::class.java))
        }
        return true

    }
}
