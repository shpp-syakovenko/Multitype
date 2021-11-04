package com.serega.multitype.ui.home.adapter.listener

import com.serega.multitype.domain.entity.Movie

interface MovieClickListener {
    fun onMovieClick(movie: Movie)
}