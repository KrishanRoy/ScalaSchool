package playground

fun main() {
    val head: Node = Node(1)
    val list: LinkedListImpl = LinkedListImpl(head)
    list.insertAtEnd(2)
    list.insertAtEnd(3)
    list.insertAtEnd(4)
    list.insertAtEnd(5)
    list.insertAtEnd(6)
    list.insertAt(4, 22)
    list.insertAtStart(0)
    list.print() //Before Deleting: 0 ===> 1 ===> 2 ===> 3 ===> 4 ===> 22 ===> 5 ===> 6 ===> null
    list.delete(4)
    list.print() //After deleting: 1 ===> 2 ===> 3 ===> 4 ===> 22 ===> 5 ===> 6 ===> null
    println(list.size())

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
        val newNodeAtDesiredIndex = Node(n)
        var current = head
        var temp: Node? = null
        var iterationTotal = 0
        while (iterationTotal != index - 1) {
            current = current?.next
            iterationTotal++
        }
        temp = current?.next
        current?.next = newNodeAtDesiredIndex
        current?.next?.next = temp
    }

    override fun insertAtStart(n: Int): Unit {
//        val newNodeAtStart = Node(n)
//        val temp = head
//        head = newNodeAtStart
//        head?.next = temp
        //another way
        val newNodeAtStart = Node(n)
        newNodeAtStart.next = head
        head = newNodeAtStart
    }

    override fun delete(index: Int): Unit {
        if (index == 0) {
            head = head?.next
        } else {
            var iterationTotal = 0
            var current = head
            while (iterationTotal != index - 1) {
                current = current?.next
                iterationTotal++
            }
            val temp = current
            temp?.next = current?.next?.next
        }
    }

    override fun print(): Unit {
        var current: Node? = head
        while (current?.next != null) {
            print("${current.data} ===> ")
            current = current.next
        }
        println("${current?.data} ===> null")
    }

    override fun size(): Int = when (head) {
        null -> 0
        else -> {
            var length = 0
            var current = head
            while (current?.next != null) {
                current = current.next
                length++
            }
            length++
            length
        }
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