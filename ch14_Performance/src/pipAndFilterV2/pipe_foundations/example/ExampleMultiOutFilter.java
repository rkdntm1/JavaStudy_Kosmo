package pipAndFilterV2.pipe_foundations.example;

import java.util.List;

import pipAndFilterV2.pipe_foundations.Pipe;
import pipAndFilterV2.pipe_foundations.SimplMultiOutFilter;


public class ExampleMultiOutFilter extends SimplMultiOutFilter<Integer, String> {
	// ... : 여러개가 들어올 수도 있다
    public ExampleMultiOutFilter(Pipe<Integer> input, Pipe<String>... output) {    	
        super(input, output);
    }

    @Override
    protected String transformOne(Integer in) {
        String out = Integer.toString(in);
        System.out.println("filtered " + Integer.toString(in) + " to " + out);
        delayForDebug(100);
        return out;
    }
}
