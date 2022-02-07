class Animal {
    private var name = ""
    private var age = 0
    private var classification = ""

    def this(name:String, age:Int, classification:String) {
        this()
        this.name = name
        this.age = age
        this.classification = classification
    }

    def this(name:String) {
        this()
        this.name = name
    }

    def getName(): String = this.name

    def getAge(): Int = this.age

    def getAge(): String = this.classification

    override def toString():String = {
        return this.name + ": " + this.age + ": " + this.classification
    }
}
