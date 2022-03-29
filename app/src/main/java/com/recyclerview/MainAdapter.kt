package com.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.databinding.ItemVideoBinding
import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {

        val binding = ItemVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int = videos.size

    class MainHolder(val binding: ItemVideoBinding): RecyclerView.ViewHolder(binding.root){
        fun render(video: JSONObject){

            binding.tvVideoTitle.setText(video.getString("title"))
            binding.tvChannelName.setText(video.getString("title"))
            binding.tvVideoViews.setText(video.getString("title"))
            binding.tvdateposted.setText(video.getString("title"))
            binding.tvVideoDuration.setText(video.getString("title"))
            binding.ivVideoThumbnail.setImageResource(R.drawable.video_placeholder)
            binding.ivAvatar.setImageResource(R.drawable.avatar_placeholder)

        }
    }
}