package kg.geektech.btech.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kg.geektech.btech.R
import kg.geektech.btech.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentRegistrationBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}