package com.muiz.bookly.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.muiz.bookly.R
import com.muiz.bookly.data.Book
import com.squareup.picasso.Picasso

class BookDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val book = intent.getSerializableExtra("book") as Book

        val title = findViewById<TextView>(R.id.title)
        title.text = book.title

        val author = findViewById<TextView>(R.id.author)
        author.text = book.author

        val description = findViewById<TextView>(R.id.description)
        description.text = book.description

        val image = findViewById<ImageView>(R.id.image)
        image.contentDescription = book.description
        Picasso.get().load(book.imageUrl).into(image)

        val rating = findViewById<TextView>(R.id.rating)
        rating.text = book.rating.toString()

        val year = findViewById<TextView>(R.id.year)
        year.text = book.year

        val language = findViewById<TextView>(R.id.language)
        language.text = book.language

        val pages = findViewById<TextView>(R.id.pages)
        pages.text = book.noOfPages.toString()

        val backIcon = findViewById<ImageView>(R.id.back_icon)
        backIcon.setOnClickListener {
            finish()
        }


    }
}