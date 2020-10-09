package com.wjthub.android.login.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.login.R
import com.wjthub.android.login.databinding.FragmentLoginRegisterBinding
import com.wjthub.android.login.viewmodel.RegisterViewModel

class LoginRegisterFragment : Fragment() {

    companion object {
        fun newInstance() = LoginRegisterFragment()
    }

    private lateinit var viewModel: RegisterViewModel
    private lateinit var viewBinding: FragmentLoginRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Binding Everything
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        viewBinding  = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login_register,
            container,
            false
        )
        viewBinding.viewModel = viewModel
        viewBinding.lifecycleOwner = this
        return viewBinding.root
    }



}