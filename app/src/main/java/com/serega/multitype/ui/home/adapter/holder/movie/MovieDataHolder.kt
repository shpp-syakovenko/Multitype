package com.serega.multitype.ui.home.adapter.holder.movie

import com.serega.multitype.core.adapter.TypeDataHolder
import com.serega.multitype.domain.AdapterContentElement
import com.serega.multitype.domain.entity.Movie


class MovieDataHolder(var movie: Movie) : TypeDataHolder {

    override fun areContentTheSame(other: AdapterContentElement): Boolean {
        if (other !is MovieDataHolder) return false
        return movie.areContentTheSame(other.movie)
    }

    override fun areItemTheSame(other: AdapterContentElement): Boolean {
        if (other !is MovieDataHolder) return false
        return movie.areItemTheSame(other)
    }

}