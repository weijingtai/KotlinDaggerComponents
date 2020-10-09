package com.wjthub.android.login.ui.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.lifecycle.ViewModelProvider
import com.wjthub.android.baselibrary.BaseApplication
import com.wjthub.android.login.R
import com.wjthub.android.login.databinding.FragmentLoginHomeBinding
import com.wjthub.android.login.di.DaggerLoginComponent
import com.wjthub.android.login.viewmodel.HomeViewModel
import javax.inject.Inject

class LoginHomeFragment : Fragment() {

    companion object {
        fun newInstance() = LoginHomeFragment()
    }
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: HomeViewModel
    private lateinit var viewBinding: FragmentLoginHomeBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        inject()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Binding Everything
        viewModel = ViewModelProvider(this,viewModelFactory)[HomeViewModel::class.java]
        viewBinding  = inflate(inflater, R.layout.fragment_login_home, container, false)
        viewBinding.viewModel = viewModel
        viewBinding.lifecycleOwner = this
        return viewBinding.root
    }
    fun inject(){
        DaggerLoginComponent
            .builder()
            .baseComponent(BaseApplication.baseComponent)
            .build()
            .inject(this)
    }
}