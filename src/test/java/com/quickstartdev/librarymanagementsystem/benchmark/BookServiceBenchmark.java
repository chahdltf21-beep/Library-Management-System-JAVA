package com.quickstartdev.librarymanagementsystem.benchmark;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class BookServiceBenchmark {

    @Benchmark
    public void testSearchBooks() {
        // simulate heavy operation
        for (int i = 0; i < 1000; i++) {
            Math.sqrt(i);
        }
    }
}

