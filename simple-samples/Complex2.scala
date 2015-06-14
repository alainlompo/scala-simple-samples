class Complex2(real: Double, imaginary: Double) {
	def re = real
	def im = imaginary
	override def toString() = 
	"" + re + ( if (im < 0) "" else "+") + im + "i"
}