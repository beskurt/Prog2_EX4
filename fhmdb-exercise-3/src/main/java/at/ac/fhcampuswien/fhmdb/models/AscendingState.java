package at.ac.fhcampuswien.fhmdb.models;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public class AscendingState implements SortingState {
    @Override
    public void sortMovies(MovieListController controller) {
        controller.sortMovies(SortedState.ASCENDING);
    }
}