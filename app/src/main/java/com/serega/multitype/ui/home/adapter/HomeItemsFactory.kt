package com.serega.multitype.ui.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.serega.multitype.R
import com.serega.multitype.core.adapter.TypeDataHolder
import com.serega.multitype.core.adapter.TypeItemsFactory
import com.serega.multitype.core.adapter.TypeViewHolder
import com.serega.multitype.ui.home.adapter.holder.comment.CommentDataHolder
import com.serega.multitype.ui.home.adapter.holder.comment.CommentEventsHolder
import com.serega.multitype.ui.home.adapter.holder.comment.CommentViewHolder
import com.serega.multitype.ui.home.adapter.holder.movie.MovieDataHolder
import com.serega.multitype.ui.home.adapter.holder.movie.MovieEventsHolder
import com.serega.multitype.ui.home.adapter.holder.movie.MovieViewHolder

class HomeItemsFactory : TypeItemsFactory() {

    val TYPE_MOVIE = 0
    val TYPE_COMMENT = 1

    override fun getDataHolderType(holder: TypeDataHolder): Int {
        return when (holder) {
            is CommentDataHolder -> TYPE_COMMENT
            is MovieDataHolder -> TYPE_MOVIE
            else -> throw RuntimeException("can't parse type for holder")
        }
    }

    override fun bindHolders(viewHolder: TypeViewHolder, dataHolder: TypeDataHolder) {

        val type = getDataHolderType(dataHolder)
        val eventHolder = eventHolders[type]

        when (type) {
            TYPE_COMMENT -> {
                (viewHolder as CommentViewHolder).bind(
                    dataHolder as CommentDataHolder,
                    eventHolder as? CommentEventsHolder
                )
            }
            TYPE_MOVIE -> {
                (viewHolder as MovieViewHolder).bind(
                    dataHolder as MovieDataHolder,
                    eventHolder as? MovieEventsHolder
                )
            }
        }
    }

    override fun createViewHolder(
        context: Context?,
        parentView: ViewGroup,
        type: Int
    ): TypeViewHolder {
        when (type) {
            TYPE_COMMENT -> {
                return CommentViewHolder(
                    LayoutInflater.from(context)
                        .inflate(R.layout.item_comment, parentView, false)
                )
            }
            TYPE_MOVIE -> {
                return MovieViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.item_movie, parentView, false)
                )
            }
        }
        throw RuntimeException("can't create holder with type $type")
    }
}