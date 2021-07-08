package com.example.homework2_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentMain.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentMain : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragmenLayout = inflater.inflate(R.layout.fragment_main,fragmentContainer,false)
        val navController = NavHostFragment.findNavController(this)

        fragmenLayout.tvFunnyPictures.setOnClickListener { navController.navigate(R.id.fragmentFunnyImages) }
        fragmenLayout.tvHabits.setOnClickListener { navController.navigate(R.id.fragmentHabits) }
        fragmenLayout.tvQuotes.setOnClickListener { navController.navigate(R.id.fragmentQuotes) }
        fragmenLayout.tvSigns.setOnClickListener { navController.navigate(R.id.fragmentSignes) }
        fragmenLayout.tvAuthor.setOnClickListener { navController.navigate(R.id.fragmentAuthor) }
        fragmenLayout.tvAnecdotes.setOnClickListener { navController.navigate(R.id.fragmentAnecdots) }
        return fragmenLayout

    }



}