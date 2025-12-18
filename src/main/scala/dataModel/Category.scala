package dataModel

sealed trait Category
case object Food extends Category
case object Transport extends Category
case object Entertainment extends Category
case object Other extends Category
