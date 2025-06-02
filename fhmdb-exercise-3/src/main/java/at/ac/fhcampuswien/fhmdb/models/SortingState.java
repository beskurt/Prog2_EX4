package at.ac.fhcampuswien.fhmdb.models;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public interface SortingState {
    void sortMovies(MovieListController controller);
}
