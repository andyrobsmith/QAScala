// CHAPTER:   OBJECT ORIENTATION
// OBJECTIVE: Answer the following questions.
// PROBLEM:   Use classes and objects to manage items and discounts at a store.
// TIME:      10 * 3 m

// CLASSES AND CONSTRUCTORS
// Q. define a Item class with properties: name and rrp
// Q. add a describe method to item which prints its name and rrp
// Q. create an item and describe() it


// Q. define a ReducedItem class with properties: name, rrp, discount
// give ReducedItem a secondary constructor with a default discount of
// 0.1 * rrp
// so the secondary constructor has arguments  name, rrp

//Q. add a price method which returns the rrp - discount

// Q. create a ReducedItem and print out its price



// OBJECTS
// Q. define a DiscountRates object
// give it christmas, easter and summer vals
// with 0.1, 0.2, 0.3 respectively


// Q. create a List of ReducedItems (a basket)
// it should contain reduced items made with the default constructor,
// the secondary constructor, and using DiscountRates to give the discount

// Q. calculate the total of the basket



// APPLY()

// Q. define a Teddy class and a Teddy object
// the Teddy object should have val numEyes = 2
// the Teddy class' constructor should accept an eyes
// the object's apply() method should creat a new Teddy
// using Teddy.numEyes as a default

//Q. create a Teddy and print out its number of eyes

//Q. create a Teddy and print out its number of eyes





//EXTRA

// Q. define a case class Customer with a name and age
// Q. create two people me, and you

// Q. define a method called printCustomer
// that accepts a Customer as an argument
// it should extract and print the name and age
// HINT: match

// Q. use printCustomer with me and you

// COMPANION OBJECT

//Q. define a companion object so that the following matches succeed

//HINT: object Detective will need an apply(): Detective
// ... and unapply(): Option[(String, String)]

class Detective private (val fullname: String, val address: String)

val Detective(firstname, secondname) = 
  Detective("Sherlock Holmes, 22B Baker St.")



val person = ("Sherlock Holmes", 27)

//Q. assign name, age from person

//Q. create a trait Person
//.. and a case class Worker with an id which extends Person,
//.. and a case class Customer with a role which extends Person

//Q. write a method which accepts any person
//.. it should print the ID if a worker is passed,
//.. and the role if a Customer is passed


def details(): List[Option[String]] =
    List(Some("Michael Burgess"), Some("United Kingdom"), None, Some("QA"))

//Q. Use a for-comprehension to produce a list of detail strings from details()
//.. where the detail provided is None, use "Unknown"





// REVIEW: What did you learn from this exercise?