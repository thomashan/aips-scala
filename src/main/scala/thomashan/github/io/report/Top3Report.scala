package thomashan.github.io.report

import thomashan.github.io.{LineEntry, Report}

class Top3Report extends Report[Seq[LineEntry]] {
  override def output(entries: Seq[LineEntry]): Seq[LineEntry] = entries
    .sortBy(_.count)
    .reverse
    .take(3)
}
