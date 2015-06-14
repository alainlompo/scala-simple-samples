object TreeAssessor {
	type Environment = String => Int
	
	def eval (t: Tree, env: Environment): Int = t match {
		case Sum(l,r) => eval(l, env) + eval(r, env)
		case Var(n) => env(n)
		case Const(v) => v
	}
}
