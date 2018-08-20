package thomashan.github.io.report

import java.time.LocalDate

import thomashan.github.io.LineEntry

class DailyTotalsReport(entries: Seq[LineEntry]) extends Report[Map[LocalDate, Long]] {
  override def output(): Map[LocalDate, Long] = entries
    .groupBy(entry ⇒ entry.localDateTime.toLocalDate)
    .map(dailyEntry ⇒ dailyEntry._1 → dailyEntry._2.map(_.count).sum)
}
