class Solution {
    companion object {
        fun <T> getType(param: Array<T>) {
            println("value of param is $param")
        }
    }
}

fun main(args: Array<String>) {
    val int = Array<Int>(1){0}
    Solution.getType<Any>(int)
}