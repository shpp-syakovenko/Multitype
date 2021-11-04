package com.serega.multitype.data.repository

import com.serega.multitype.domain.entity.Movie

interface MoviesRepository {

    suspend fun loadMovies(): List<Movie>
}