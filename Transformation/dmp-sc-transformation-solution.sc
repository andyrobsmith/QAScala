// CHAPTER:   FLOW
// OBJECTIVE: Complete the following questions.
// PROBLEM:   Use selection expressions to select different greetings.
// PROBLEM:   Use for-comprehensions to analyse a list of people.
// TIME:      2 * 10 m


// PART 1 -- BRANCHING & MATCHING

val time = "AM"

//Q. using one assignment,
//.. define the val greeting to be either "Hello" if time is AM,
//.. or "Goodbye" if time is PM
val greeting = if(time == "AM") {
  "Hello"
} else {
  "Goodbye"
}

// Q. add a case to handle "spot"
val dog = "spot"

val message = dog match {
    case "fido" => "Hello Boy!"
    case "fluffy" => "Hello Girl!"
    case "spot" => "Hello Boy!"
}

println(message)

// Q. rewrite the above if-expression as a match-expression
//... called secondGreeting
val secondGreeting = time match {
  case "AM" => "Hello"
  case _ => "Goodbye"
}

//Q. and print it
println(secondGreeting)

//Q. print the greeting without defining a variable
// ie., just the match expression
println(time match {
  case "AM" => "Hello"
  case "PM" => "Goodbye"
})



// PART 2 -- FOR COMPREHENSIONS

val mixed = List(1, "2", false, 3.4)

//Q. print out every element of this list
for(e <- mixed) println(e)

//Q. using a for-comprehension, 
// define a list of strings from the list mixed above
// HINT: yield
val strings = for(e <- mixed) yield e.toString


//Q. using a range, print out "Ho!" three times 
for(i <- 1 to 3) println("Ho")

val people = List("Michael 10", "John 20", "Watson 40")

//Q. define ages, a Vector[Int] of the ages 
//HINT: .split .toInt yield
val ages = for(entry <- people) yield entry.split(" ")(1).toInt

// Q. determine the average age
//HINT: use a var total

var total = 0
for(a <- ages) total += a

// ages reduce { _ + _ }

println(s"The average is ${total/ages.length}")



//EXTRA


// FILTER

// Q. print out s"you're allowed in, $name" for all the the adults
// HINT: .split

for { n <- people 
    parts = n.split(" ")
    if parts(1).toInt > 18
} println(s"you're allowed in, ${parts(0)}")

// define name using a let-expression


for(p <- people; name = p.split(" ")(0)) println(s"you're allowed in $name")


// simple roguelike games print grids as their videogame "frame"
// which the player moves around on...
// complete the following questions to use for-comprehensions to generate such a grid...

// Q. use a for-comprehension to create a sequence of 5 '.'s called row
// HINT: the input must be the same length as the output, in this case
val row = for(i <- 1 to 5) yield '.'

// Q. print out row on one line
//HINT:  use print()
for(cell <- row) print(cell)

// Q. use a for-comprehension to create a sequence of 5 rows called grid
//HINT: yield a for-comprehension
val grid = for(i <- 1 to 5) yield for(i <- 1 to 5) yield '.'

// Q. print out grid
// with each row on its own line
//HINT: .mkString is easier than for-print
for(row <- grid) println(row.mkString)

// REVIEW: What did you learn from this exercise?