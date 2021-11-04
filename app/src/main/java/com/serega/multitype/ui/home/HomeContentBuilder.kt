package com.serega.multitype.ui.home

import androidx.lifecycle.MutableLiveData
import com.serega.multitype.core.adapter.TypeDataHolder
import com.serega.multitype.domain.entity.Comment
import com.serega.multitype.domain.entity.Movie
import com.serega.multitype.ui.home.adapter.holder.comment.CommentDataHolder
import com.serega.multitype.ui.home.adapter.holder.movie.MovieDataHolder

class HomeContentBuilder {

    val contentItems = MutableLiveData<MutableList<TypeDataHolder>>()

    fun build(movies: List<Movie>, comments: List<Comment>) {

        val items = mutableListOf<TypeDataHolder>()

        items.addAll(movies.take(3).map { MovieDataHolder(it) })

        items.addAll(comments.map { CommentDataHolder(it) })

        items.addAll(movies.takeLast(movies.size - 3).map { MovieDataHolder(it) })

        contentItems.postValue(items)
    }
}