package playground

fun main(){
    val head: Node = Node(1)
    val list: LinkedListImpl = LinkedListImpl(head)
    list.insertAtEnd(2)
    list.insertAtEnd(3)
    list.insertAtEnd(3)
    list.insertAtEnd(4)
    list.insertAtEnd(5)
    list.print()
}
class Node(val data: Int, var next: Node? = null)

class LinkedListImpl(private var head: Node? = null) : LinkedList {
    override fun insertAtEnd(n: Int): Unit {
        val newNode: Node = Node(n)
        if (head == null) {
            head = newNode
        } else {
            var current: Node? = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    override fun insertAt(index: Int, n: Int): Unit {
        TODO("Not yet implemented")
    }

    override fun insertAtStart(n: Int): Unit {
        TODO("Not yet implemented")
    }

    override fun delete(index: Int): Unit {
        TODO("Not yet implemented")
    }

    override fun print(): Unit {
        var current: Node? = head
        while (current?.next != null) {
            print("${current.data} ===> ")
            current = current.next
        }
        println("${current?.data} ===> null")
    }

    override fun size(): Int {
        TODO("Not yet implemented")
    }
}

interface LinkedList {
    fun insertAtEnd(n: Int): Unit
    fun insertAt(index: Int, n: Int): Unit
    fun insertAtStart(n: Int): Unit
    fun delete(index: Int): Unit
    fun print(): Unit
    fun size(): Int
}