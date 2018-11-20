package ir.heydarii.androidloadingfragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.lottie.LottieAnimationView


private const val FILE_NAME = "fileName"

open class LoadingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //defining lottie view
        val lottieView = view.findViewById<LottieAnimationView>(R.id.lottie)

        //getting file name
        val fileName = Intent().getStringExtra(FILE_NAME)

        //setting up lottie
        lottieView.setAnimation(fileName)
        lottieView.playAnimation()
    }

    companion object {
        private var loadingFragment: LoadingFragment? = null
        fun getInstance(fileName: String = "loading.json"): LoadingFragment? {
            if (loadingFragment == null) {
                loadingFragment = LoadingFragment()
            }
            val bundle = Bundle()
            bundle.putString(FILE_NAME, fileName)
            loadingFragment?.arguments = bundle

            return loadingFragment

        }
    }

}
