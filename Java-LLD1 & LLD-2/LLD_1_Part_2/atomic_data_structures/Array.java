package LLD_1_Part_2.atomic_data_structures;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;

import java.net.http.*;
import java.net.URI;


public class Array {
    public static void main(String[] args) {

        
        /*
        AtomicIntegerArray: of integer,
        AtomicLongArray: of long,
        AtomicReferenceArray: of object
        methods: get(idx), set(idx, val), compareAndSet(index, expectedValue, newValue)
        AtomicReference
         */
        AtomicLongArray arr=new AtomicLongArray(5);
        arr.set(0, 15);
        System.out.println(arr.get(0));
    }
}
