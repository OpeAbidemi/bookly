package com.muiz.bookly.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muiz.bookly.R
import com.muiz.bookly.activities.BookDetails
import com.muiz.bookly.data.Book
import com.squareup.picasso.Picasso

class BookListAdapter(private val books: List<Book>) : RecyclerView.Adapter<BookListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.title)
        val author: TextView = itemView.findViewById(R.id.author)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        // Loads image to imageview
        Picasso.get().load(book.imageUrl).into(holder.imageView)
        holder.imageView.contentDescription = book.description
        // Set book title
        holder.title.text = book.title
        // Set book author
        holder.author.text = book.author

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, BookDetails::class.java)

            intent.putExtra("book", book)

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return books.size
    }
}