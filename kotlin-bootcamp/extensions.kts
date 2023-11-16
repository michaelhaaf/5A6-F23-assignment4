// Step 1: Make some pairs and triples

val equipment = "fish net" to "catching fish"
println("${equipment.first}") used for ${equipment.second}")

// output: fish net used for catching fish

val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())

// output: (6, 9, 42)
// output: [6, 9, 42]

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
println("${equipment2.first.second}")

// output: (fish net, catching fish) is equipment
// output: catching fish

// Step 2: Destructure some pairs and triples

val (tool, use) = equipment
println("$tool is used for $use")

// output: fish net is used for catching fish

val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")

// output: 6 9 42
