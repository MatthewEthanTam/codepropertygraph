package io.shiftleft.semanticcpg.language.operatorextension

import io.shiftleft.codepropertygraph.generated.nodes.{Expression, Identifier}
import io.shiftleft.semanticcpg.language._
import overflowdb.traversal._

class ArrayAccessTraversal(val traversal: Traversal[OpNodes.ArrayAccess]) extends AnyVal {
  def array: Traversal[Expression] = traversal.map(_.array)
  def subscripts: Traversal[Identifier] = traversal.flatMap(_.subscripts)
}
