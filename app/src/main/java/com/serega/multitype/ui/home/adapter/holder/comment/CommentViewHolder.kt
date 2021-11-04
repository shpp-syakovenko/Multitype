package com.serega.multitype.ui.home.adapter.holder.comment

import android.view.View
import com.serega.multitype.core.adapter.TypeViewHolder
import com.serega.multitype.databinding.ItemCommentBinding

class CommentViewHolder(itemView: View) : TypeViewHolder(itemView) {

    private val binding: ItemCommentBinding = ItemCommentBinding.bind(itemView)

    fun bind(dataHolder: CommentDataHolder, eventsHolder: CommentEventsHolder?) {

        binding.comment = dataHolder.comment
        binding.root.setOnClickListener {
            eventsHolder?.commentClickListener?.onCommentClick(dataHolder.comment)
        }

        binding.executePendingBindings()
    }
}