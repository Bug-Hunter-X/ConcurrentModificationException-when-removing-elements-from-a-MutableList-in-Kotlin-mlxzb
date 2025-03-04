```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 } //Correct way to remove elements
    println(list) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item > 2) {
            iterator.remove()
        }
    }
    println(list2)// Output: [1, 2]
}
```