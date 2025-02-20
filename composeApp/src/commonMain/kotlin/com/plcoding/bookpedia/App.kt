package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel


@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerpadding ->
        BookListScreenRoot(
            viewModel = viewModel,
            onBookClick = {}
        )

    }

}