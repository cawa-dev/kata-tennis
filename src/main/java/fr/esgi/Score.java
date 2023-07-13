package fr.esgi;

import java.util.Optional;

public enum Score {
    LOVE,
    FIFTEEN,
    THIRTY,
    FORTY;

    public Optional<Score> next() {
        return switch (this) {
            case LOVE -> Optional.of(FIFTEEN);
            case FIFTEEN -> Optional.of(THIRTY);
            case THIRTY, FORTY -> Optional.of(FORTY);
        };
    }
}
