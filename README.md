# Kotlin ConcurrentModificationException when removing elements from MutableList

This example demonstrates the `ConcurrentModificationException` that occurs when you try to modify a `MutableList` while iterating over it using a standard `for` loop.  The correct way is shown in the solution using `removeIf` or an iterator.