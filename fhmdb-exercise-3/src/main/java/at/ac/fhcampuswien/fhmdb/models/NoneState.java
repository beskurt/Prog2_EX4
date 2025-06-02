package at.ac.fhcampuswien.fhmdb.models;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public class NoneState implements SortingState {
    @Override
    public void sortMovies(MovieListController controller) {
        // Do nothing, as there is no sorting required in this state
    }
}
