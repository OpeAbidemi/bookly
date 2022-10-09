package com.muiz.bookly.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.muiz.bookly.R
import com.muiz.bookly.adapters.BookListAdapter
import com.muiz.bookly.data.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Popular Books
        val popularBooksList = findViewById<RecyclerView>(R.id.popular_books)
        val popularBooksListAdapter = BookListAdapter(Book.books)
        popularBooksList.adapter = popularBooksListAdapter

        // Free books
        val freeBooksList = findViewById<RecyclerView>(R.id.free_books)
        val freeBooksListAdapter = BookListAdapter(Book.books)
        freeBooksList.adapter = freeBooksListAdapter

        // Paid books
        val paidBooksList = findViewById<RecyclerView>(R.id.paid_books)
        val paidBooksListAdapter = BookListAdapter(Book.books)
        paidBooksList.adapter = paidBooksListAdapter

    }
}