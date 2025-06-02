package at.ac.fhcampuswien.fhmdb.models;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public class DescendingState implements SortingState {
    @Override
    public void sortMovies(MovieListController controller) {
        controller.sortMovies(SortedState.DESCENDING);
    }
}