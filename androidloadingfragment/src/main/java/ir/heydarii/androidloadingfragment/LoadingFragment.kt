package ir.heydarii.androidloadingfragment


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.fragment_loading.*


private const val FILE_NAME = "fileName"

class LoadingFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //making background color transparent
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));

        //getting file name
        val fileName = arguments?.getString(FILE_NAME)

        //setting up lottie
        setUpLottieView(fileName)
    }

    private fun setUpLottieView(fileName: String?) {
        // lottie has defined in the layout file
        lottie.setAnimation(fileName)
        lottie.playAnimation()
        lottie.repeatCount = LottieDrawable.INFINITE
        lottie.repeatMode = LottieDrawable.RESTART
    }

    fun dismissDialog() {
        dismiss()
    }

    companion object {

        private var loadingFragment: LoadingFragment? = null

        /**
         * gets a file name that should be available in assets folder
         */
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
