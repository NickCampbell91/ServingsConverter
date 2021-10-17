fun convertToCups(a: Float, type: Int): Float{
    val recipe = Recipe()
    var b: Float = 0F

    if (type == 1){
        b = a
    }

    if (type == 2){
        b = a / 2
    }

    if (type == 3){
        b = a / 3
    }

    if (type == 4){
        b = a / 4
    }

    if (type == 5){
        b = a / 16
    }

    if (type == 6){
        b = a / 48
    }

    return b
}

fun main() {
    val recipe = Recipe()
    val simplify = Simplify()
    var newMeasurementInCups: Float = 0F

    val type = recipe.getIngredient()

    var multiplier: Float = (recipe.newServings / recipe.oldServings)

//    println("The multiplier is: $multiplier")

    var newMeasurement = multiplier * recipe.measurement

//    println("The new measurement is: $newMeasurement")

    newMeasurementInCups = convertToCups(newMeasurement, type)

//    println("The new measurement in cups is: $newMeasurementInCups")

    simplify.simplifyMeasurement(newMeasurementInCups)

//    println("The number of cups is: ${simplify.cups}")

//    print("Number of Cups: ${simplify.quarterCups}")
//    print(recipe.measurementsMap[recipe.measurementType])

    println("Add ${simplify.cups} cup(s) " +
            "${simplify.halfCups}/2 cup, " +
            "${simplify.thirdCups}/3 cup(s), " +
            "${simplify.quarterCups}/4 cup(s), " +
            "${simplify.tablespoons} tablespoon(s), " +
            "${simplify.teaspoons} teaspoons(s) of ${recipe.ingredient}")

//    println("Remaining: ${simplify.a}")
}