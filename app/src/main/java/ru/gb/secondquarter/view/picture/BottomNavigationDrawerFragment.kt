package ru.gb.secondquarter.view.picture


import android.os.Bundle
import android.view.*
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ru.gb.secondquarter.R
import ru.gb.secondquarter.databinding.FragmentBottomNavigationLayoutBinding

class BottomNavigationDrawerFragment : BottomSheetDialogFragment() {

    var _binding: FragmentBottomNavigationLayoutBinding? = null
    val binding: FragmentBottomNavigationLayoutBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBottomNavigationLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_one -> {
                    Toast.makeText(
                        requireContext().applicationContext,
                        "На экран 1",
                        Toast.LENGTH_SHORT
                    ).show()
                    dismiss()
                }
                R.id.navigation_two -> {
                    Toast.makeText(
                        context,
                        "На экран 2",
                        Toast.LENGTH_SHORT
                    ).show()
                    dismiss()
                }
            }
            true
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = BottomNavigationDrawerFragment()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}