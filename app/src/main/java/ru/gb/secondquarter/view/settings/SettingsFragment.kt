package ru.gb.secondquarter.view.settings

import android.os.Bundle
import android.os.PowerManager
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.chip.Chip
import com.google.android.material.tabs.TabLayout
import ru.gb.secondquarter.R
import ru.gb.secondquarter.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    var _binding: FragmentSettingsBinding? = null
    val binding: FragmentSettingsBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_bottom_bar, menu)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chipSet()
    }

    private fun chipSet() {
        binding.chipGroup.setOnCheckedChangeListener { group, position ->
            /* TODO HW
             when(position){
                1->{viewModel.sendRequestToday()}
                2->{viewModel.sendRequestYT()}
                3->{viewModel.sendRequestTDBY()}
            }*/
            group.findViewById<Chip>(position)?.let {
                Log.d("@@@", "${it.text.toString()} $position")
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SettingsFragment()
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}