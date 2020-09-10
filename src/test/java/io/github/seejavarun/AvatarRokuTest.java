package io.github.seejavarun;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class AvatarRokuTest {

  AtlaTranscripts atla = mock(AtlaTranscripts.class);
  FrequencyAnalyzer freq = mock(FrequencyAnalyzer.class);

  @Test
  void runTest() throws IOException {

    doReturn("one two two three three three").when(atla).get(anyInt());

    AvatarRoku avatarRoku = new AvatarRoku(atla, freq);
    avatarRoku.run();

    // there should only be 1 call made out to fetch HTML

    verify(atla, times(1)).get(anyInt());


  }
}
