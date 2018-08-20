package thomashan.github.io.report

import thomashan.github.io.LineEntry

class TotalsReport(entries: Seq[LineEntry]) extends Report[Long] {
  override def output(): Long = entries
    .map(e ⇒ e.count)
    .sum
}
