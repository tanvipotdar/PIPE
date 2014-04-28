package pipe.reachability.io;

import pipe.reachability.state.Record;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public interface ReachabilityReader {
    /**
     * Process the entire stream and build up a collection of Records.
     *
     * @param stream input stream
     * @return Collection of all state transitions with rates
     */
    Collection<Record> getRecords(InputStream stream) throws IOException;
}