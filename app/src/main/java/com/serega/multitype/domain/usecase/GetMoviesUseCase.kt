package com.serega.multitype.domain.usecase

import com.serega.multitype.data.repository.MoviesRepository

class GetMoviesUseCase(private val moviesRepository: MoviesRepository) {

    suspend fun loadMovies() = moviesRepository.loadMovies()
}