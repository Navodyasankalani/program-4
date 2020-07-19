object CaesarCiper{

def main( args: Array[String])
{
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val Encription = ( c: Char, key: Int, a: String) => a((a.indexOf(c.toUpper) + key) % a.size)
val Decription = ( c: Char, key: Int, a: String) => {
            val index = (a.indexOf(c.toUpper) - key) % a.size
            a(if (index >= 0)  index else (a.size + index))
        }

val cipher = ( algo: (Char,Int,String) => Char,s: String, key: Int, a: String) => s.map( algo(_,key,a))

print(" Enter a string without spaces : ")
val s = scala.io.StdIn.readLine()

print(" Enter the number of shifts :")
val key = scala.io.StdIn.readInt()

val ct = cipher(Encription,s,key,alphabet)
println(" Encripted message : " + ct)

val pt = cipher(Decription,ct,key,alphabet)
println("Input Encripted message : " + pt)
}


}

