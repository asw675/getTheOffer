package com.example.swordactivity.utils


class Link(node : Node) {
    var head = Node ("")
    var eNode = node

    init {
        head.next = eNode
    }

    class Node(data:String){
        var data = data
        var next: Node? = null
    }
    fun add(data : String){ val node = Node(data)
        eNode.next = node
        eNode = node
    }
}