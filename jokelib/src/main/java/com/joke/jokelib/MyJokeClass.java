package com.joke.jokelib;

import java.util.Random;
import java.util.SplittableRandom;

public class MyJokeClass {

    private final static String[] jokes = {
            "Why do programmers always mix up Halloween and Christmas?\n\n" +
                    "Because Oct 31 equals Dec 25.",
            "There are only 10 kinds of people in this world:\n\n" +
                    "those who know binary and those who do not",
            "Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.",
            "Programming is like sex:\n\n" +
                    "One mistake and you have to support it for the rest of your life.",
            "Have you heard about the new Cray super computer?\nIt's so fast, it executes an infinite loop in 6 seconds."
    };

    public static String getJoke() {
        return jokes[new Random().nextInt(5)];
    }
}
