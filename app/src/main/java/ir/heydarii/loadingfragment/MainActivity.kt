package ir.heydarii.loadingfragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import ir.heydarii.androidloadingfragment.LoadingFragment
import ir.heydarii.loadingfragment.databinding.ActivityMainBinding

// constant Tag
private const val TAG = "TAG"

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //showDialog has defined in the layout
        binding.showDialog.setOnClickListener { showLoading() }
    }

    //shows dialog with a custom tag
    private fun showLoading() {
        LoadingFragment
            .getInstance(fileName = "progress_bar.json", isCancelable = true)
            .show(supportFragmentManager, TAG)
        hideLoading()
    }

    //hides dialog after 5 secs
    private fun hideLoading() {
        Handler(Looper.getMainLooper()).postDelayed({
            LoadingFragment.getInstance().dismissDialog()
        }, 5000)
    }
}
