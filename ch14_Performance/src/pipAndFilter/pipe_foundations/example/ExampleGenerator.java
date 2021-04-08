package pipAndFilter.pipe_foundations.example;

import pipAndFilter.pipe_foundations.Generator;
import pipAndFilter.pipe_foundations.Pipe;

public class ExampleGenerator extends Generator<Integer> {
    public ExampleGenerator(Pipe<Integer> output) {
        super(output);
    }

    @Override
    public void generateInto(Pipe<Integer> pipe) {
        for (int i = 1; i <= 10; i++) {
            pipe.put(i);
            System.out.println("generated " + Integer.toString(i));
            delayForDebug(200);
        }
        pipe.closeForWriting();
        System.out.println("generator finished");
    }
}
