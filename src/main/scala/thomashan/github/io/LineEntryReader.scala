package thomashan.github.io

import java.io.InputStream
import java.time.LocalDateTime

import scala.io.Source


object LineEntryReader {
  def read(inputStream: InputStream): Seq[LineEntry] = {
    Source.fromInputStream(inputStream)
      .getLines()
      .map { line ⇒
        val elements = line.split(" ")
        val dateTimeString = elements(0)
        val countString = elements(1)

        LineEntry(LocalDateTime.parse(dateTimeString), countString.toLong)
      }
      .toSeq
  }
}
