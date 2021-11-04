package com.serega.multitype.ui.home.adapter.holder.movie

import android.view.View
import com.serega.multitype.core.adapter.TypeViewHolder
import com.serega.multitype.databinding.ItemMovieBinding

class MovieViewHolder(itemView: View) : TypeViewHolder(itemView) {

    private val binding: ItemMovieBinding = ItemMovieBinding.bind(itemView)

    fun bind(dataHolder: MovieDataHolder, eventsHolder: MovieEventsHolder?) {

        binding.movie = dataHolder.movie
        binding.root.setOnClickListener {
            eventsHolder?.movieClickListener?.onMovieClick(dataHolder.movie)
        }

        binding.executePendingBindings()
    }
}