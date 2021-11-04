package com.serega.multitype.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.serega.multitype.core.adapter.TypeAdapter
import com.serega.multitype.databinding.FragmentHomeBinding
import com.serega.multitype.domain.entity.Comment
import com.serega.multitype.domain.entity.Movie
import com.serega.multitype.ui.home.adapter.HomeItemsFactory
import com.serega.multitype.ui.home.adapter.holder.comment.CommentEventsHolder
import com.serega.multitype.ui.home.adapter.holder.movie.MovieEventsHolder
import com.serega.multitype.ui.home.adapter.listener.CommentClickListener
import com.serega.multitype.ui.home.adapter.listener.MovieClickListener
import org.koin.android.viewmodel.ext.android.viewModel


class HomeFragment : Fragment(), MovieClickListener, CommentClickListener {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentHomeBinding.inflate(inflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner

        val homeItemsFactory = HomeItemsFactory()
        val adapter = TypeAdapter(homeItemsFactory)

        adapter.setEventHolder(
            eventsHolder = MovieEventsHolder().apply { movieClickListener = this@HomeFragment },
            type = homeItemsFactory.TYPE_MOVIE
        )

        adapter.setEventHolder(
            eventsHolder = CommentEventsHolder().apply { commentClickListener = this@HomeFragment },
            type = homeItemsFactory.TYPE_COMMENT
        )

        binding.rvHome.layoutManager = LinearLayoutManager(requireContext())
        binding.rvHome.adapter = adapter

        viewModel.homeItems.observe(viewLifecycleOwner, { adapter.submitList(it) })
    }

    override fun onCommentClick(comment: Comment) {
        println("event: onCommentClick")
    }

    override fun onMovieClick(movie: Movie) {
        println("event: onMovieClick")
    }

}