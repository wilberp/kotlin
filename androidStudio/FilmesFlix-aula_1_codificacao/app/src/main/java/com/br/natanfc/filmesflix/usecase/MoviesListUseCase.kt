package com.br.natanfc.filmesflix.usecase

import com.br.natanfc.filmesflix.data.MovieRepository
import com.br.natanfc.filmesflix.implementation.MovieDataSourceImplementation


class MoviesListUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke() = movieRepository.getAllMoviesFromDataSource()

}