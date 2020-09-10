package io.github.seejavarun;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AtlaTranscripts {

  public String get(int num) throws IOException {
    final Document doc = Jsoup
        .connect("http://atla.avatarspirit.net/transcripts.php")
        .data("num", String.valueOf(num))
        .get();
    return doc.body().selectFirst(".content").text();
  }
}
