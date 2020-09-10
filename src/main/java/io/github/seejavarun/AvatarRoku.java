package io.github.seejavarun;

import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvatarRoku {

  private final Logger log = LoggerFactory.getLogger(this.getClass());
  private final AtlaTranscripts atlaTranscripts;
  private final FrequencyAnalyzer frequencyAnalyzer;

  public AvatarRoku(AtlaTranscripts atlaTranscripts, FrequencyAnalyzer frequencyAnalyzer) {
    this.atlaTranscripts=atlaTranscripts;
    this.frequencyAnalyzer = frequencyAnalyzer;
  }

  public void run() throws IOException {
    String content = atlaTranscripts.get(108);
    List<WordFrequency> wordFrequencies = frequencyAnalyzer
        .load(new ByteArrayInputStream(content.getBytes()));
    wordFrequencies
        .forEach(word -> log.info("{} x{}",word.getWord(), word.getFrequency()));
  }
}
