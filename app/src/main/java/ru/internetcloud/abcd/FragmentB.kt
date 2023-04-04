package ru.internetcloud.abcd

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.internetcloud.abcd.databinding.FragmentBBinding

class FragmentB : Fragment(R.layout.fragment_b) {

    private val binding by viewBinding(FragmentBBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentC)
        }
    }
}