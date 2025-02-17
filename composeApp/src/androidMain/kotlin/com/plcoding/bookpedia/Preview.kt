package com.plcoding.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState


private val books = (1..100).map{
    Book(
        id = it.toString(),
        title = "Book $it",
        authors = listOf("Author"),
        imageUrl = "https://picsum.photos/200",
        description = "Description $it",
        languages = emptyList(),
        firstPublish = "First Publish $it",
        averageRating = it.toDouble(),
        ratingsCount = it,
        numPages = it,
        numEditions = it
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}

