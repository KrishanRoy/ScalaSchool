package exercises

abstract class MyList {
  /*
   * head = first element of the list
   * tail = remainder of the list
   * isEmpty = is this list empty
   * add (int) = new list with this element added
   * toString => String representation of the list
   */
  var head: LinkedListNode
  //val tail: Int = null

  def isEmpty: Boolean

  def add(n: Int)

  def toString: String

}

//class LinkedList(override var head: LinkedListNode = new LinkedListNode(1)) extends MyList {
//  override def isEmpty: Boolean = ???
//
//  override def add(n: Int): Unit = {
//    val temp = new LinkedListNode(n)
//    val current = head
//    if( head == null){
//      head = temp
//    }
//
//  }
//}

class LinkedListNode(val n: Int) {
  val next: LinkedListNode = null
}
