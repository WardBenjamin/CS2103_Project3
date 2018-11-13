import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class GraphCustomTester {

    IMDBGraphImpl _graph, _graphMini;
    GraphSearchEngine _se;

    @Before
    public void init() throws IOException {
        _graph = new IMDBGraphImpl("IMDB/actors.list", "IMDB/actresses.list");

        _graphMini = new IMDBGraphImpl("IMDB/actors_test_ours.list", "IMDB/actresses_test.list");

        _se = new GraphSearchEngineImpl();
    }

    @Test
    public void finishedLoading() {
        assertTrue(true);
    }

    @Test
    public void nodeVerification() {
        System.out.println(_graph.getActor("Jeremy, Ron"));
    }

    @Test
    public void famousPeople() {
        final Node carrey = _graph.getActor("Carrey, Jim");
        final Node obaama = _graph.getActor("Obama, Barack");

        final Node cruz = _graph.getActor("Cruz, Ted (II)");
        final Node jeremy = _graph.getActor("Jeremy, Ron");
        final Node malkova = _graph.getActor("Malkova, Mia");
        final Node riley = _graph.getActor("Reid, Riley (III)");
        final Node texas = _graph.getActor("Texas, Alexis");
        final Node love = _graph.getActor("Love, Brandi (I)");
        final Node ann = _graph.getActor("Ann, Lisa");
        final Node jordan = _graph.getActor("Jordan, Kacey");


        printPath(obaama, cruz);
        printPath(cruz, jeremy);
//        printPath(obaama, jordan);
//        printPath(cruz, jordan);
//        printPath(obaama, riley);
//        printPath(jeremy, cruz);
//        printPath(carrey, malkova);
//        printPath(jeremy, jordan);
    }

    @Test
    public void threeHops() {
        final Node p1 = _graphMini.getActor("Actor1");
        final Node p2 = _graphMini.getActor("Actor4");

        printPath(p1, p2);
    }

    private void printPath(Node a1, Node a2) {
        List<Node> path = _se.findShortestPath(a1, a2);

        System.out.println();

        for(Node n: path) {
            System.out.println(n.getName());
        }

        System.out.println();
    }
}
