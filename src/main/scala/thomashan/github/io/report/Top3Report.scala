package thomashan.github.io.report

import thomashan.github.io.LineEntry

class Top3Report(entries: Seq[LineEntry]) extends Report[Seq[LineEntry]] {
  override def output(): Seq[LineEntry] = entries
    .sortBy(_.count)
    .reverse
    .take(3)
}
