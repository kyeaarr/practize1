fun main(args: Array<String>) {
        // task1
        val exercises: Int = 13
        var exercisesSolved: Int = 0
        exercisesSolved += 1

        // task6
        var age: Int  // тут var, не val
        age = 16
        print(age)
        age = 30
        print(age)
        exercisesSolved += 1

        // task7
        val a: Int = 46
        val b: Int = 10
        val answer1: Int = (a * 100) + b
        val answer2: Int = (a * 100) + (b * 100)
        val answer3: Int = (a * 100) + (b / 10)
        exercisesSolved += 1

        // task8
        (5 * 3) - ((4 / 2) * 2)
        exercisesSolved += 1

        // task9
        val x: Double = 7.5
        val y: Double = 5.0
        val average: Double = (x + y) / 2
        exercisesSolved += 1

        // task10
        val fahrenheit: Double = 121.0
        val celcius: Double = (fahrenheit - 32) / 1.8
        exercisesSolved += 1

        // task11
        val position: Int = 54
        val row: Int = position / 8
        val column: Int = position % 8
        exercisesSolved += 1

        // task12
    import kotlin.math.*
        val degrees: Double = 360.0
        val radians: Double = (degrees / 180) * PI
        exercisesSolved += 1

        // task13
        val x1: Double = 1.0
        val y1: Double = 1.0
        val x2: Double = 3.0
        val y2: Double = 3.0
        val dx: Double = x2 - x1
        val dy: Double = y2 - y1
        val distance: Double = sqrt(dx * dx + dy * dy)
        exercisesSolved += 1
    }
}