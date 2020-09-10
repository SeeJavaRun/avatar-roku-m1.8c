package io.github.seejavarun;

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import java.io.IOException;

public class Main {

  public static void main(String...args) throws IOException {
    System.out.println("starting…");

    // build dependencies so AvatarRoku class doesnt have to
    // bother with the construction details

    AtlaTranscripts atlaTranscripts = new AtlaTranscripts();

    FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
    frequencyAnalyzer.setWordFrequenciesToReturn(10);
    frequencyAnalyzer.setMinWordLength(4);
    //    frequencyAnalyzer.setStopWords(loadStopWords());

    // AvatarRoku class is doing to
    new AvatarRoku(atlaTranscripts, frequencyAnalyzer).run();

  }

}
