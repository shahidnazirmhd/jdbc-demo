package com.example.movie;

import java.time.LocalDate;
import java.util.List;

public record Movie(Long id,
                    String name,
                    LocalDate releaseDate) {
}
