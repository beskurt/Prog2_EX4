package at.ac.fhcampuswien.fhmdb.api;

import at.ac.fhcampuswien.fhmdb.models.Genre;

import java.util.ArrayList;
import java.util.List;

public class MovieAPIBuilder {

    private final String base;
    private String query;
    private Genre genre;
    private String releaseYear;
    private String ratingFrom;


    public MovieAPIBuilder(String base) {
        this.base = base;
    }

    public MovieAPIBuilder query(String query) {
        this.query = query;
        return this;
    }

    public MovieAPIBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public MovieAPIBuilder releaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public MovieAPIBuilder ratingFrom(String ratingFrom) {
        this.ratingFrom = ratingFrom;
        return this;
    }

    public String build() {
        StringBuilder urlBuilder = new StringBuilder(base);

        if (query != null || genre != null || releaseYear != null || ratingFrom != null) {
            List<String> queryParams = new ArrayList<>();

            if (query != null) {
                queryParams.add("query=" + query);
            }
            if (genre != null) {
                queryParams.add("genre=" + genre);
            }
            if (releaseYear != null) {
                queryParams.add("releaseYear=" + releaseYear);
            }
            if (ratingFrom != null) {
                queryParams.add("ratingFrom=" + ratingFrom);
            }

            urlBuilder.append("?");
            urlBuilder.append(String.join("&", queryParams));
        }

        return urlBuilder.toString();
    }
}
