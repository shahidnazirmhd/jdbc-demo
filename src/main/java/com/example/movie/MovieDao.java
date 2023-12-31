package com.example.movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    List<Movie> selectMovies();
    int insertMovie(Movie movie);
    int deleteMovie(long id);
    Optional<Movie> selectMovieById(long id);

    // TODO: Update
}
