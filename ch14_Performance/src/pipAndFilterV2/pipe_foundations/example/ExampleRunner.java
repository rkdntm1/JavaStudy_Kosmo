package pipAndFilterV2.pipe_foundations.example;

import pipAndFilterV2.pipe_foundations.Filter;
import pipAndFilterV2.pipe_foundations.Generator;
import pipAndFilterV2.pipe_foundations.Pipe;
import pipAndFilterV2.pipe_foundations.PipeImpl;
import pipAndFilterV2.pipe_foundations.Sink;

public class ExampleRunner {
    public static void main(String[] args) {
        // create pipes
        final Pipe<Integer> genToFilter = new PipeImpl<Integer>();
        final Pipe<String> filterToOut = new PipeImpl<String>();

        // create components that use the pipes
        final Generator<Integer> generator = new ExampleGenerator(genToFilter);
        final Filter<Integer, String> filter = new ExampleFilter(genToFilter, filterToOut);
        final Sink<String> sink = new ExampleSink(filterToOut);

        // start all components
        generator.start();
        filter.start();
        sink.start();

        System.out.println("runner finished");
    }
}

