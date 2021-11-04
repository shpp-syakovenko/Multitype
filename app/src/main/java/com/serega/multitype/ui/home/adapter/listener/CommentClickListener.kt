package com.serega.multitype.ui.home.adapter.listener

import com.serega.multitype.domain.entity.Comment

interface CommentClickListener {
    fun onCommentClick(comment: Comment)
}