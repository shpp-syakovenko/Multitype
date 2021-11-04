package com.serega.multitype.di

import com.serega.multitype.data.repository.CommentsRepository
import com.serega.multitype.data.repository.MoviesRepository
import com.serega.multitype.data.repository.impl.CommentsRepositoryImpl
import com.serega.multitype.data.repository.impl.MoviesRepositoryImpl
import com.serega.multitype.domain.usecase.GetCommentsUseCase
import com.serega.multitype.domain.usecase.GetMoviesUseCase
import com.serega.multitype.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val seregaModule = module {

    viewModel { HomeViewModel(get(), get(), get()) }


    single<CommentsRepository> { CommentsRepositoryImpl() }

    single<MoviesRepository> { MoviesRepositoryImpl() }

    single { GetCommentsUseCase(get()) }

    single { GetMoviesUseCase(get()) }

}