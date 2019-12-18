package com.stradivarius.japanesestudy.ui.main.ui.levelselector.dialog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.stradivarius.japanesestudy.R
import kotlinx.android.synthetic.main.level_selector_checkbox.view.*

internal class LevelSelectorDialogAdapter(
    private val data: List<Int>
) : RecyclerView.Adapter<LevelSelectorDialogAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val checkbox = LayoutInflater.from(parent.context)
            .inflate(R.layout.level_selector_checkbox, parent, false) as CheckBox

        return MyViewHolder(
            checkbox
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.view.level_selector_checkbox.text = data[position].toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

}