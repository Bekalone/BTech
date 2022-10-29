package kg.geektech.btech.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.geektech.btech.databinding.FragmentDetailBinding
import kg.geektech.btech.presentation.ui.adapter.ViewPagerAdapter
//
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

class DetailFragment : Fragment() {
//    private var param1: String? = null
//    private var param2: String? = null
    private lateinit var binding: FragmentDetailBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = ViewPagerAdapter()
        binding.dotsIndicator.attachTo(binding.viewPager)
    }

//    companion object {
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            DetailFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
}