package com.example.navdrawerdemo.ui.contact

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.navdrawerdemo.R
import com.example.navdrawerdemo.databinding.ContactFragmentBinding
import com.example.navdrawerdemo.databinding.FragmentGalleryBinding
import com.example.navdrawerdemo.ui.gallery.GalleryViewModel

class ContactFragment : Fragment() {

    private lateinit var contactViewModel: ContactViewModel
    private var _binding: ContactFragmentBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactViewModel =
            ViewModelProvider(this).get(ContactViewModel::class.java)

        _binding = ContactFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tv1
        contactViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    //override fun onActivityCreated(savedInstanceState: Bundle?) {
      //  super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
        // TODO: Use the ViewModel
    //}

    //companion object {
    // fun newInstance() = ContactFragment()
    //}

}