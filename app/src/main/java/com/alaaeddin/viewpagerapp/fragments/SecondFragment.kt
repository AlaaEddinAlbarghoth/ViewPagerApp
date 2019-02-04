package com.alaaeddin.viewpagerapp.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.alaaeddin.viewpagerapp.R

private const val ARG_PARAM = "param"

class SecondFragment : Fragment() {

    private var param: String? = null
    var textView:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param = it.getString(ARG_PARAM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_second, container, false)
        textView = view.findViewById(R.id.textView)
        textView?.text = getString(R.string.hello_fragment, param)

        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        activity?.resources?.getString(R.string.hello_fragment, param)
    }

    companion object {
        @JvmStatic
        fun newInstance(param: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM, param)
                }
            }
    }
}
