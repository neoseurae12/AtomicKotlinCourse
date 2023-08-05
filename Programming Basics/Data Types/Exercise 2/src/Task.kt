// DataTypes/Task2.kt
package dataTypesExercise2

import kotlin.reflect.typeOf

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'


  // Int : can be combined with 'int & double' types
  val ii : Int = int + int
  val id : Double = int + double
//  val ib = int + boolean
//  val is = int + string
//  val ic = int + character

  // Double : can be combined with 'int & double' types
  val di : Double = double + int
  val dd : Double = double + double
//  val db = double + boolean
//  val ds = double + string
//  val dc = double + character

  // Boolean : can NOT be combined with every type (including itself...!)
//  val bi = boolean + int
//  val bd = boolean + double
//  val bb = boolean + boolean
//  val bs = boolean + string
//  val bc = boolean + character

  // String : can be combined with "every" other type
  val si: String = string + int
  val sd: String = string + double
  val sb: String = string + boolean
  val sc: String = string + character

  // Character : can be combined with 'int & string' types
  val ci : Char = character + int // 'k'
//  val cd = character + double
//  val cb = character + boolean
  val cs : String = character + string
//  val cc = character + character  // Type mismatch: inferred type is Char but Int was expected


  // Can be combined:

  println("The type that can be combined " +
          "with every other type using '+':")
  println("String")

}