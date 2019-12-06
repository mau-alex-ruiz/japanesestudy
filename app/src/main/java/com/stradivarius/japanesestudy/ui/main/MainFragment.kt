package com.stradivarius.japanesestudy.ui.main

import android.content.Context
import android.util.Log
import com.stradivarius.japanesestudy.R
import com.stradivarius.japanesestudy.databinding.MainFragmentBinding
import com.stradivarius.japanesestudy.ui.main.common.BaseFragment
import com.stradivarius.japanesestudy.ui.main.data.Radical
import com.stradivarius.japanesestudy.ui.main.repository.LocalSessionWrapperImpl
import com.stradivarius.japanesestudy.ui.main.ui.LoadingFragment
import com.stradivarius.japanesestudy.ui.main.ui.levelselector.LevelSelectorFragment
import java.util.logging.Level

internal class MainFragment(context: Context) : BaseFragment<MainViewModel, MainFragmentBinding>() {

    override fun provideViewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun provideLayoutResource(): Int = R.layout.main_fragment

    override fun bindViewModel(viewModel: MainViewModel, bindingLayout: MainFragmentBinding) {
        bindingLayout.model = viewModel
        bindingLayout.vocabCard.cardView.setOnClickListener { startCardFragment(VOCAB_CARD) }
        bindingLayout.kanjiCard.cardView.setOnClickListener { startCardFragment(KANJI_CARD) }
        bindingLayout.radicalsCard.cardView.setOnClickListener { startCardFragment(RADICAL_CARD) }
    }

    fun startCardFragment(cardType: Int) {
        showFragment(LevelSelectorFragment.newInstance(cardType), "FromMainFragment")
    }

    companion object {
        private const val VOCAB_CARD = 1
        private const val KANJI_CARD = 2
        private const val RADICAL_CARD = 3

        fun newInstance(context: Context) =
            MainFragment(context)
    }
}
