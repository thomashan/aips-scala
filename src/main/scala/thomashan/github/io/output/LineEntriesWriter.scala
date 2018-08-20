package thomashan.github.io.output

import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

import thomashan.github.io.LineEntry

class LineEntriesWriter(entries: Seq[LineEntry]) extends LineEntryWriter {
  override def output(): String = {
    entries
      .sortBy(_.localDateTime.toEpochSecond(ZoneOffset.UTC))
      .map { entry ⇒
        s"${entry.localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)} ${entry.count}"
      }
      .mkString("\n")
  }
}
