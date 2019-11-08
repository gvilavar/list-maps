//Collections in Kotlin

fun main() {
    // განსხვავება ლისთებსა და არაის შორის
    // ლისთებისგან განსხვავებით Array შეიძლება გამოვიყენოთ Enum კლასებთან და Annotation-ებთან სამუშაოდ
    // ასევე ლისთების მოდიფიკაციისთვის ვიყენებთ სპეციალურად mutable ლისთებს, რასაც არაი არ საჭიროებს

    val a = arrayOf(1, 2, 3)
    a[0] = a[1] //
    val l = listOf(1, 2, 3)
    //l[0] = l[1] // არ გაეშვება
    val m = mutableListOf(1, 2, 3)
    m[0] = m[1]



    val names = listOf("Dato", "Rati", "Nino", "Ani")
    println(names[0]) //დავბეჭდოთ რომელიმე კონკრეტული მნიშვნელობა ჩვენი ლისთიდან
    names.forEach { names ->
        println(names) //დავბეჭდოთ მთლიანად ლისთი

    }
    names.forEachIndexed { index, names ->
        println("$names is at $index")   //ლისთში შემავალი მნიშნველობების თანმიმდევრული ინდექსაცია
    }
    val nums = listOf(11, 5, 3, 8, 1, 9, 6, 2)

    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
               max: $max, min: $min,
               count: $len, sum: $sum,
               average: $avg
              """
    println(msg.trimIndent())

//კოტლინში გვაქვს ორი სახის Collection type-ები 1-Muttable $ Imuttable types
//ამ შემთხვევაში გვაქვს Imuttable ლისთი, რაც იმას ნიშნავს, რომ ჩვენ არ შეგვიძლია ჩვენს ლისთში ჩავამატოტ ახალი ან წავშალოთ ძველი სთრინგები

    val lists = mutableListOf("100", "Dagvicere", "Nikoloz") //Mutable List
    lists.add("Dzaan gtxovt") //ვამატებთ
    lists.remove("Dagvicere") // წაშლა
    println(lists)
    lists.clear() //
    println(lists)

    // მაპებიდან წაკითხვის სხვადასხვა მეთოდები
    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)
    println(items.get("coins"))
    println(items["coins"])

    println(items.getValue("coins"))

    println(items.getOrDefault("pens", 0))
    println(items.getOrDefault("pencils", 0))

    val nOfPencils = items.getOrElse("pencils", {
        0
    })

    println(nOfPencils)


//
    val map = mapOf(
        1 to "D",
        2 to "A",  //  გვაქვს Key : 1, 2, 3, 4 და Values: D, A, T, O
        3 to "T",
        4 to "O"
        // მაფების გასაღებები არის უნიკალური. ყოველი ერთი გასაღები უკავშირდება ერთ მნიშვნელობას.
    ) //მეფების დახმარებით შეგვიძლია მნიშვნელობების ერთმანეთთან დაწყვილება
    map.forEach { key, value -> println("$key - $value") }          //ამ შემთხვევაში გვაქვს 4 წყვილი
    println("Map Keys: "+map.keys )
    println("Map Values: "+map.values )
    // გვაქვს მეფის ზომის განსაზღვრის ორი მეთოდი
    println("ზომა : "+map.size)  //პირველი
    println("ზომა : "+map.count()) //მეორე

//ანალოგიურად არის მეფების შემთხვევაშიც, თუ გვინდა დავამატოთ წყვილები უნდა გამოვიყენოთ Mutable map
    val map1 = mutableMapOf(5 to "K")
    map1.put(6, "V") // ვამატებთ
    map1.forEach { key, value ->
        println("$key -> $value")
    }

    //შემოწმება
    val last = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)

    if (last.containsKey("cups")) {

        println("contains cups")
    } else {

        println("does not contain cups")
    }
}