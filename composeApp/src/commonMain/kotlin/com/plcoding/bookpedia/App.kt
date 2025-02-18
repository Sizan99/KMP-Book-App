package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerpadding ->
        BookListScreenRoot(
            viewModel = remember { BookListViewModel() },
            onBookClick = {}
        )

    }

}