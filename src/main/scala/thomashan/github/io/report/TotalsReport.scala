package thomashan.github.io.report

import thomashan.github.io.{LineEntry, Report}

class TotalsReport extends Report[Long] {
  override def output(entries: Seq[LineEntry]): Long = entries
    .map(e ⇒ e.count)
    .sum
}
