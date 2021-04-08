package pipAndFilterV2.pipe_foundations;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiOutFilter<I, O> extends ThreadedRunner {
	protected Pipe<I> input;
	protected Pipe<O>[] output;

	public MultiOutFilter(Pipe<I> input, Pipe<O>... output) {
		this.input = input;
		this.output = output;
	}

	@Override
	public void run() {
		transformBetween(input, output);
	}

	protected abstract void transformBetween(Pipe<I> input, Pipe<O>[] output);
}
