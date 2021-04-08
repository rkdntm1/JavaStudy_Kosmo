package pipAndFilterV2.pipe_foundations.example;

import pipAndFilterV2.pipe_foundations.Generator;
import pipAndFilterV2.pipe_foundations.MultiOutFilter;
import pipAndFilterV2.pipe_foundations.Pipe;
import pipAndFilterV2.pipe_foundations.PipeImpl;
import pipAndFilterV2.pipe_foundations.Sink;

public class ExampleMultiPipeRunner {
    public static void main(String[] args) {
        // create pipes
        final Pipe<Integer> genToFilter = new PipeImpl<Integer>();
        final Pipe<String> filterToOut1 = new PipeImpl<String>();
        final Pipe<String> filterToOut2 = new PipeImpl<String>();

        // create components that use the pipes
        final Generator<Integer> generator = new ExampleGenerator(genToFilter);
        final MultiOutFilter<Integer, String> filter = new ExampleMultiOutFilter(genToFilter, filterToOut1, filterToOut2);
        final Sink<String> sink1 = new ExampleSink(filterToOut1);
        final Sink<String> sink2 = new ExampleSink(filterToOut2);

        // start all components
        generator.start();
        filter.start();
        sink1.start();
        sink2.start();

        System.out.println("runner finished");
    }
}

