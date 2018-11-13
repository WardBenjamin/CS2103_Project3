import java.io.IOException;
import java.util.Collection;

public class IMDBGraphImpl implements IMDBGraph {

    public IMDBGraphImpl (String actorsFilename, String actressesFilename) throws IOException {
        // Load data from the specified actorsFilename and actressesFilename ...
    }

    @Override
    public Collection<? extends Node> getActors() {
        return null;
    }

    @Override
    public Collection<? extends Node> getMovies() {
        return null;
    }

    @Override
    public Node getMovie(String name) {
        return null;
    }

    @Override
    public Node getActor(String name) {
        return null;
    }
}
