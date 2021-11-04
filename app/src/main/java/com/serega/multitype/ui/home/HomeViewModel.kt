package com.serega.multitype.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.serega.multitype.core.adapter.TypeDataHolder
import com.serega.multitype.domain.usecase.GetCommentsUseCase
import com.serega.multitype.domain.usecase.GetMoviesUseCase
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val getCommentsUseCase: GetCommentsUseCase,
    application: Application
) : AndroidViewModel(application) {

    private val contentBuilder = HomeContentBuilder()
    val homeItems: LiveData<MutableList<TypeDataHolder>> = contentBuilder.contentItems

    init {
        viewModelScope.launch { loadMovies() }
    }

    private suspend fun loadMovies() {
        contentBuilder.build(getMoviesUseCase.loadMovies(), getCommentsUseCase.loadComments())
    }

}