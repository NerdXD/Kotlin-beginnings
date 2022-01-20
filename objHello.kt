//Object Oriented Hello World!


public class Hi {
    public fun print(msg: String) {
        println(msg)

    }

    public fun info(info: String) {
        println(info)
    }

}


fun main(args: Array<String>) {
    val h = Hi()
    h.print("LEARNING KOTLIN!!!")
    h.info("KOTLIN IS ANOTHER JVM LANGUAGE! <3")
	
}
