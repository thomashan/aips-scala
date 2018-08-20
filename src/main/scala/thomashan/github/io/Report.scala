package thomashan.github.io

trait Report[O] {
  def output(entries: Seq[LineEntry]): O
}
