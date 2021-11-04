package com.serega.multitype.ui.home.adapter.holder.comment

import com.serega.multitype.core.adapter.TypeDataHolder
import com.serega.multitype.domain.AdapterContentElement
import com.serega.multitype.domain.entity.Comment

class CommentDataHolder(var comment: Comment) : TypeDataHolder {

    override fun areContentTheSame(other: AdapterContentElement): Boolean {
        if (other !is CommentDataHolder) return false
        return comment.areContentTheSame(other.comment)
    }

    override fun areItemTheSame(other: AdapterContentElement): Boolean {
        if (other !is CommentDataHolder) return false
        return comment.areItemTheSame(other)
    }

}