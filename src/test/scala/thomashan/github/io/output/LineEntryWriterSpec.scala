package thomashan.github.io.output

import org.scalatest.WordSpec

abstract class LineEntryWriterSpec[I] extends WordSpec {
  protected def input: I
}
