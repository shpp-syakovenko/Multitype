package com.serega.multitype.data.repository.impl

import com.serega.multitype.data.repository.MoviesRepository
import com.serega.multitype.domain.entity.Movie

class MoviesRepositoryImpl : MoviesRepository {

    override suspend  fun loadMovies(): List<Movie> {

        return listOf(
            Movie(id = "1", name = "xxxx", rating = "1"),
            Movie(id = "2", name = "cccc", rating = "1"),
            Movie(id = "3", name = "zzzz", rating = "1"),
            Movie(id = "4", name = "4444", rating = "1"),
            Movie(id = "5", name = "jjjj", rating = "1"),
            Movie(id = "6", name = "jsdsj", rating = "1"),
            Movie(id = "7", name = "jjjdsfsfj", rating = "1"),
            Movie(id = "8", name = "jjjsfwfj", rating = "1"),
            Movie(id = "9", name = "jjertgtjj", rating = "1"),
        )
    }
}