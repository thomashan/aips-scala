package thomashan.github.io.output

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DailyTotalsWriter(dailyTotals: Map[LocalDate, Long]) extends LineEntryWriter {
  override def output(): String = {
    dailyTotals.toSeq
      .sortBy(_._1.toEpochDay)
      .map { dailyTotal ⇒
        s"${dailyTotal._1.format(DateTimeFormatter.ISO_DATE)} ${dailyTotal._2}"
      }
      .mkString("\n")
  }
}
