package ir.heydarii.loadingfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.heydarii.androidloadingfragment.LoadingFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoadingFragment.getInstance()?.show(supportFragmentManager,"tag")
    }
}
