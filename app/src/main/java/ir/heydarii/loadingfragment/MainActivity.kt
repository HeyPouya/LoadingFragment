package ir.heydarii.loadingfragment

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import ir.heydarii.androidloadingfragment.LoadingFragment
import kotlinx.android.synthetic.main.activity_main.*

// constant Tag
private const val TAG = "TAG"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //showDialog has defined in the layout
        showDialog.setOnClickListener { showLoading() }

    }

    //shows dialog with a custom tag
    private fun showLoading() {
        LoadingFragment.getInstance()?.show(supportFragmentManager, TAG)
        hideLoading()
    }

    //hides dialog after 5 secs
    private fun hideLoading() {
        val handler = Handler()
        handler.postDelayed({ LoadingFragment.getInstance()?.dismissDialog() }, 5000)
    }
}
