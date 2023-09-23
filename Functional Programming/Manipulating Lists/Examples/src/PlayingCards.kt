// ManipulatingLists/PlayingCards.kt
package manipulatinglists
import atomictest.trace
import kotlin.random.Random

enum class Suit {
  Spade, Club, Heart, Diamond
}

enum class Rank(val faceValue: Int) {
  Ace(1), Two(2), Three(3), Four(4), Five(5),
  Six(6), Seven(7), Eight(8), Nine(9),
  Ten(10), Jack(10), Queen(10), King(10)
}

class Card(val rank: Rank, val suit: Suit) {
  override fun toString() =
    "$rank of ${suit}s"
}

val flatMappingDeck: List<Card> =
  Suit.values().flatMap { suit ->   // flatMap()
    Rank.values().map { rank ->
      Card(rank, suit)
    }
  }

val mappingDeck: List<List<Card>> =
  Suit.values().map { suit ->      // map()
    Rank.values().map { rank ->
      Card(rank, suit)
    }
  }

fun main() {
  val rand = Random(26)
  repeat(7) {
    trace("'${flatMappingDeck.random(rand)}'")
  }
  trace eq """
    'Jack of Hearts' 'Four of Hearts'
    'Five of Clubs' 'Seven of Clubs'
    'Jack of Diamonds' 'Ten of Spades'
    'Seven of Spades'
  """

  println()
  println("$mappingDeck\n" + "mappingDeck's size: ${mappingDeck.size}")
}