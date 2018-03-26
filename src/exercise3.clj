(ns exercise3)

(defn fibonacci [x]
	(def secuence (list 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610))
	(def zero (list 0))
	(if ( = x 0)
	  (first zero)
	  (nth secuence (- x 1)))
)




